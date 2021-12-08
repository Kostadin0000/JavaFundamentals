package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String command1 = tokens[0];
            if (command1.equals("Add")) {
                int numberToAdd = Integer.parseInt(tokens[1]);
                numbers.add(numberToAdd);
            } else if (command1.equals("Insert")) {
                int number1 = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (!(index >= 0 && index <= numbers.size() - 1)) {
                    System.out.println("Invalid index");
                }
                numbers.add(index, number1);
            } else if (command1.equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);

                if (!(index >= 0 && index <= numbers.size() - 1)) {
                    System.out.println("Invalid index");
                }else{
                    numbers.remove(index);

                }
            } else if (command1.equals("Shift")) {

                if (tokens[1].equals("left")) {
                    int count = Integer.parseInt(tokens[2]);

                    for (int i = 1; i <= count; i++) {
                        int firstNumber = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(firstNumber);
                    }

                } else if (tokens[1].equals("right")) {
                    int count = Integer.parseInt(tokens[2]);


                    for (int i = 1; i <= count; i++) {
                        int lastNumber = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, lastNumber);
                    }
                }
            }


            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
