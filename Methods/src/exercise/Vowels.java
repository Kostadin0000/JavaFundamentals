package exercise;

import java.util.Locale;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        printCount(input);
    }

    private static void printCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == 'a' || currentSymbol == 'e'
                    || currentSymbol == 'i' || currentSymbol == 'o' || currentSymbol == 'u') {
                count++;
            }

        }
        System.out.println(count);
    }
}
