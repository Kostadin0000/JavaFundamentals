package exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();


        printChars(input1, input2);
    }
    static void printChars(String input1, String input2) {
        int a = (int) input1.charAt(0);
        int b = (int) input2.charAt(0);
        if (a < b) {
            for (int i = a + 1; i <= b - 1; i++) {
                System.out.print((char) i + " ");

            }
        } else {
            for (int i = b + 1; i <= a - 1; i++) {
                System.out.print((char) i + " ");

            }
        }

    }
}
