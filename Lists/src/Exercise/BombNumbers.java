package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        String[] tokens = command.split("\\s+");
        int bomb = Integer.parseInt(tokens[0]);
        int count = Integer.parseInt(tokens[1]);
        int counter = 0;

        for (int i = numbers.indexOf(bomb) - 1; i > numbers.indexOf(0); i--) {
            numbers.remove(i);
            counter++;
            if (counter == count) {
                break;
            }
        }

        counter = 0;

        for (int i = numbers.indexOf(bomb) + 1; i < numbers.size(); i++) {
            numbers.remove(i);
            counter++;
            if (counter == count) {
                break;
            }
        }


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bomb) {
                numbers.remove(Integer.valueOf(bomb));
                break;
            }
        }


        if (numbers.contains(bomb)) {
            counter = 0;
            for (int i = numbers.indexOf(bomb) - 1; i > numbers.indexOf(0); i--) {
                numbers.remove(i);
                counter++;
                if (counter == count) {
                    break;
                }
            }


            counter = 0;

            for (int i = numbers.indexOf(bomb) + 1; i < numbers.size(); i++) {
                numbers.remove(i);
                counter++;
                if (counter == count) {
                    break;
                }
            }


            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == bomb) {
                    numbers.remove(Integer.valueOf(bomb));
                    break;
                }
            }


            int sum = 0;

            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }


            System.out.print(sum);


        } else {

            int sum = 0;

            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }

            System.out.print(sum);

        }


    }
}