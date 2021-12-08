package Exam;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder bob = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (command.equals("Change")) {
                String replaced = tokens[1];
                String replacement = tokens[2];
                String str = bob.toString();
                str = bob.toString().replace(replaced, replacement);
                bob = new StringBuilder(str);
                System.out.println(str.toString());

            } else if (command.equals("Includes")) {
                String check = tokens[1];
                if (bob.toString().contains(check)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("End")) {
                String check2 = tokens[1];
                String sun = bob.substring(bob.length() - check2.length(), bob.length());
                if (check2.equals(sun)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.equals("Uppercase")) {
                String str2 = bob.toString();
                str2 = bob.toString().toUpperCase();
                bob = new StringBuilder(str2);
                System.out.println(bob.toString());
            } else if (command.equals("FindIndex")) {
                String match = tokens[1];
                int index = 0;
                String str3 = bob.toString();
                index = bob.indexOf(match);
                System.out.println(index);
            } else if (command.equals("Cut")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int lenth = Integer.parseInt(tokens[2]);
                String sub = bob.substring(startIndex, startIndex + lenth);
                bob = new StringBuilder(sub);
                System.out.println(sub);
            }


            input = scanner.nextLine();
        }
    }
}
