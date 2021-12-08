package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);
                if (!numbers.contains(element)){
                    command = scanner.nextLine();
                    continue;
                }
                for (int index = 0; index < numbers.size(); index++) {
                    if (numbers.get(index) == element) {
                        numbers.remove(index);
                        index = -1;
                    }
                }
            } else if (tokens[0].equals("Insert")) {

                int element1 = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);

                numbers.add(position, element1);
            }


            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
