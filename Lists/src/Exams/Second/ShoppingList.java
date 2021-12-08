package Exams.Second;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] tokens = command.split("\\s+");
            String command1 = tokens[0];

            if (command1.equals("Urgent")) {
                String item = tokens[1];
                if (numbers.contains(item)) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    numbers.add(0,item);
                }
            } else if (command1.equals("Unnecessary")) {
                String item2 = tokens[1];
                if (numbers.contains(item2)) {
                    numbers.remove(item2);
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            } else if (command1.equals("Correct")) {
                String oldItem = tokens[1];
                String newItem = tokens[2];
                if (numbers.contains(oldItem)) {
                    numbers.set(numbers.indexOf(oldItem), newItem);
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            } else if (command1.equals("Rearrange")) {
                String item3 = tokens[1];
                if (numbers.contains(item3)) {
                    String removedItem = item3;
                    numbers.remove(item3);
                    numbers.add(removedItem);
                }
            }


            command = scanner.nextLine();
        }

        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + ", ");

            }
        }
    }
}
