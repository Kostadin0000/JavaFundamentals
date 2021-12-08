package exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")){
            int size = command.length();
            String a = "";
            for (int i = size-1; i >= 0; i--) {
                 a += command.charAt(i);
            }
            if (a.equals(command)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

            command = scanner.nextLine();
        }
    }
}
