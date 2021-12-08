package FinalExam3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder bob = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] tokens = input.split(":\\|:");
            String command = tokens[0];

            if (command.equals("InsertSpace")) {
                int index = Integer.parseInt(tokens[1]);
                bob.insert(index, " ");
                System.out.println(bob);
            } else if (command.equals("Reverse")) {
                String str = tokens[1];
                if (bob.toString().contains(str)) {
                    String reversed = str;
                    StringBuilder newBob = new StringBuilder();
                    for (int i = 0; i < reversed.length(); i++) {
                        newBob.append(reversed.charAt(reversed.length() - 1 - i));
                    }
                    newBob.toString();

                    int index1 = bob.indexOf(str);
                    int index2 = index1 + str.length();
                    bob.replace(index1,index2,"");
                    bob.append(newBob);
                    System.out.println(bob);

                } else {
                    System.out.println("error");
                }
            } else if (command.equals("ChangeAll")) {
                String match = tokens[1];
                String replacement = tokens[2];
                String changed = bob.toString().replace(match, replacement);
                bob = new StringBuilder(changed);
                System.out.println(bob);
            }


            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", bob.toString());
    }
}
