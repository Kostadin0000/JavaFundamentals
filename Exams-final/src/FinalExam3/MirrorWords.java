package FinalExam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        StringBuilder bob = new StringBuilder();

        String regex = "([#@])(?<wordOne>[A-Za-z][A-Za-z][A-Za-z]+)\\1\\1(?<wordTwo>[A-Za-z][A-Za-z][A-Za-z]+)\\1";
        int count = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            count++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");

            for (int i = 0; i < wordTwo.length(); i++) {
                bob.append(wordTwo.charAt(wordTwo.length() - 1 - i));
            }
            if (wordOne.equals(bob.toString())) {
                list.add(wordOne);
                list2.add(wordTwo);
            }
            bob.setLength(0);

        }
        if (count == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!%n", count);
            if (list.size() == 0) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        System.out.printf("%s <=> %s", list.get(i), list2.get(i));
                    } else {
                        System.out.printf("%s <=> %s, ", list.get(i), list2.get(i));

                    }
                }

            }
        }
    }
}