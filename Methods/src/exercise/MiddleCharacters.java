package exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() % 2 == 0) {
            printEvenChar(input);
        } else {
            printOddChar(input);

        }
    }

    private static void printOddChar(String input) {
        int size = (input.length() / 2);
        char c = input.charAt(size);
        System.out.printf("%c", c);
    }

    private static void printEvenChar(String input) {
        if (input.length() % 2 == 0) {
            int size = input.length() / 2;
            int size1 = (input.length() / 2) - 1;
            char a = input.charAt(size);
            char b = input.charAt(size1);
            System.out.printf("%c%c", b, a);
        }
    }
}
