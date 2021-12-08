package Exams.Third;

import java.util.*;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = new ArrayList<>();
        for (String s : scanner.nextLine().split("\\s+")) {
            numbers.add(s);
        }

        String command = scanner.nextLine();
        int moves = 0;
        while (!command.equals("end")) {


            String[] tokens = command.split("\\s+");
            int index1 = Integer.parseInt(tokens[0]);
            int index2 = Integer.parseInt(tokens[1]);
            moves++;


            if (!(index1 >= 0 && index1 < numbers.size()) || !(index2 >= 0 && index2 < numbers.size())) {
                System.out.println("Invalid input! Adding additional elements to the board");
                for (int i = 0; i < 2; i++) {
                    numbers.add(numbers.size() / 2, "-" + moves + "a");
                }
                command = scanner.nextLine();
                continue;
            } else if (index1 == index2) {
                System.out.println("Invalid input! Adding additional elements to the board");
                for (int i = 0; i < 2; i++) {
                    numbers.add(numbers.size() / 2, "-" + moves + "a");
                }
                command = scanner.nextLine();
                continue;
            }


            if (numbers.get(index1).equals(numbers.get(index2))) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", numbers.get(index1));
                String a = numbers.get(index1);
                numbers.removeAll(Collections.singleton(a));
            } else {
                System.out.println("Try again!");
            }


            if (numbers.size() == 0 || numbers.size() == 1) {
                System.out.printf("You have won in %d turns!", moves);
                break;
            }


            command = scanner.nextLine();

        }

        if (numbers.size() != 0) {
            System.out.println("Sorry you lose :(");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
