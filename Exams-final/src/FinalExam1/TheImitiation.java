package FinalExam1;

import java.util.Scanner;

public class TheImitiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] tokens = input.split("\\|");

            String command = tokens[0];

            if (command.equals("Move")) {
                int numberOfLetToMove = Integer.parseInt(tokens[1]);
                String cut = builder.substring(0, numberOfLetToMove);
                builder.delete(0, numberOfLetToMove);
                builder.append(cut);

            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(tokens[1]);
                String value = tokens[2];
                builder.insert(index, value);

            } else if (command.equals("ChangeAll")) {
                String substringg = tokens[1];
                String replacement = tokens[2];
                String str = builder.toString();
                str = builder.toString().replace(substringg, replacement);
                builder = new StringBuilder(str);
            }
            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s",builder.toString());
    }
}
/*
•	Move {number of letters}
o	Moves the first n letters to the back of the string.

•	Insert {index} {value}
o	Inserts the given value before the given index in the string.

•	ChangeAll {substring} {replacement}
o	Changes all occurrences of the given substring with the replacement text.

 */