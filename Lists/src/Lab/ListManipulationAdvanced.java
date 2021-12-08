package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            String firstCommand1 = tokens[0];
            switch (firstCommand1) {
                case "Contains":
                    int secondCommand = Integer.parseInt(tokens[1]);
                    if (numbers.contains(secondCommand)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondcommand = tokens[1];
                    if (secondcommand.equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }

                    } else if (secondcommand.equals("odd")) {

                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 1) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String secondcommand2 = tokens[1];
                    int num = Integer.parseInt(tokens[2]);
                    if (secondcommand2.equals(">")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > num) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (secondcommand2.equals("<")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < num) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (secondcommand2.equals(">=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= num) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (secondcommand2.equals("<=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= num) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
