package exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        boolean isValid = checkLength(pass);
        boolean isValid1 = checkLetterAndDigits(pass);
        boolean isValid2 = checkTwoDigits(pass);


        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValid1) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValid2) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValid && isValid1 && isValid2) {
            System.out.println("Password is valid");
        }

    }

    private static boolean checkTwoDigits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            int a = pass.charAt(i);
            if (a >= 48 && a <= 57) {
                count++;
            }

        }
        return count >= 2;
    }

    private static boolean checkLetterAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            int a = pass.charAt(i);
            boolean isSmallLetter = a >= 97 && a <= 122;
            boolean isCapitalLetter = a >= 65 && a <= 90;
            boolean isDigit = a >= 48 && a <= 57;
            if(!isSmallLetter && !isCapitalLetter && !isDigit) {
                return false;
            }
        }
        return true;

    }

    private static boolean checkLength(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }
}
