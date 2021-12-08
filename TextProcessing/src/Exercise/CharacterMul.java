package Exercise;

import java.util.Scanner;

public class CharacterMul {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        printSum(words[0], words[1]);

    }

    private static void printSum(String word, String word1) {
        int sum = 0;

        if (word.length() == word1.length()) {
            for (int i = 0; i < word.length(); i++) {
                int c = word.charAt(i);
                int a = word1.charAt(i);
                sum += c * a;
            }
        } else {
            int min = returnMin(word.length(), word1.length());

            if (min == word.length()) {
                for (int i = 0; i < word.length(); i++) {
                    int c = word.charAt(i);
                    int a = word1.charAt(i);
                    sum += c * a;
                }
                String substring;
                substring = word1.substring(word.length());
                for (int i = 0; i < substring.length(); i++) {
                    int b = substring.charAt(i);
                    sum += b;
                }
            } else {
                for (int i = 0; i < word1.length(); i++) {
                    int c = word.charAt(i);
                    int a = word1.charAt(i);
                    sum += c * a;
                }
                String substring;
                substring = word.substring(word1.length());
                for (int i = 0; i < substring.length(); i++) {
                    int b = substring.charAt(i);
                    sum += b;
                }
            }

        }

        System.out.println(sum);


    }

    private static int returnMin(int length, int length1) {
        if (length < length1) {
            return length;
        } else {
            return length1;
        }
    }
}
