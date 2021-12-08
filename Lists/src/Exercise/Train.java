package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            String command1 = tokens[0];
            if (command1.equals("Add")) {
                int numberToAdd = Integer.parseInt(tokens[1]);
                numbers.add(numberToAdd);
            } else {
                int count = Integer.parseInt(tokens[0]);
                for (int i = 0; i < numbers.size(); i++) {
                    int a = numbers.get(i) + count;
                    if (a <= maxCapacity) {
                        numbers.set(i, a);
                        break;
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
