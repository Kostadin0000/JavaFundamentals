package Exams.Third;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("Shoot")) {
                int index = Integer.parseInt(tokens[1]);
                int power = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    int sum = numbers.get(index) - power;
                    numbers.set(index, sum);
                    if (sum <= 0) {
                        numbers.remove(index);

                    }
                }
            } else if (tokens[0].equals("Add")) {
                int index1 = Integer.parseInt(tokens[1]);
                int value = Integer.parseInt(tokens[2]);
                if (index1 >= 0 && index1 < numbers.size()) {
                    numbers.add(index1, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (tokens[0].equals("Strike")) {
                int index2 = Integer.parseInt(tokens[1]);
                int radius = Integer.parseInt(tokens[2]);
                if (index2 >= 0 && index2 < numbers.size()) {
                    int a = index2 + radius;
                    int b = index2 - radius;
                    if (a >= 0 && a < numbers.size() && b >= 0 && b < numbers.size()) {
                        for (int i = index2; i < a; i++) {
                            numbers.remove(i);

                        }
                        for (int k = index2; k >= b; k--) {
                            numbers.remove(k);

                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                }
            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + "|");

            }
        }

    }
}
