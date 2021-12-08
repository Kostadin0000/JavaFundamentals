package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();



        while (!command.equals("end")) {
            String[] command1 = command.split(" ");
            String token = command1[0];
            String number = command1[1];

            switch (token) {
                case "Add":
                    int num = Integer.parseInt(number);
                    numbers.add(num);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(Integer.parseInt(number)));


                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(number));

                    break;
                case "Insert":
                    String index = command1[2];
                    int in = Integer.parseInt(index);
                    int num1 = Integer.parseInt(number);
                    numbers.add(in,num1);


                    break;

            }

            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
