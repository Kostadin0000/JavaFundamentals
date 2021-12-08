package Exams.Third;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] tokens = command.split(" - ");

            if (tokens[0].equals("Collect")) {
                String item = tokens[1];

                if (numbers.contains(item)) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    numbers.add(item);
                }
            } else if (tokens[0].equals("Drop")) {
                String item1 = tokens[1];
                if (numbers.contains(item1)) {
                    numbers.remove(item1);
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            } else if (tokens[0].equals("Combine Items")) {
                String[] split = tokens[1].split(":");
                String oldItem = split[0];
                String newItem = split[1];
                if (numbers.contains(oldItem)) {
                    numbers.add(numbers.indexOf(oldItem) + 1, newItem);
                }
            } else if (tokens[0].equals("Renew")) {
                String item3 = tokens[1];
                if (numbers.contains(item3)) {
                    String removedItem = item3;
                    numbers.remove(item3);
                    numbers.add(removedItem);
                }
            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size()-1){
                System.out.print(numbers.get(i));
            }else{
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }
}
