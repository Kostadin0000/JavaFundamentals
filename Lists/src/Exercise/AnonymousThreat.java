package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("merge")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int lastIndex = Integer.parseInt(tokens[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (lastIndex > numbers.size() - 1) {
                    lastIndex = numbers.size() - 1;
                }
                int a = startIndex;
                int b = lastIndex;
                for (int i = a; i < b; i++) {
                    numbers.set(a, numbers.get(a) + numbers.get(a + 1));
                    numbers.remove(a + 1);
                }

            } else {
                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);

                if (index >= 0 && index < numbers.size() && partitions >= 0 && partitions <= 100) {
                    String element = numbers.get(index);
                    List<String> newList = new ArrayList<>();

                    if (element.length() % partitions == 0) {
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";
                            for (int j = 0; j < portionLength; j++) {
                                char symbol = element.charAt(count);
                                concat += symbol;
                                count++;
                            }
                            newList.add(concat);
                        }
                    } else {
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";

                            if (i == partitions - 1) {
                                for (int j = count; j < element.length(); j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            } else {
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            }
                            newList.add(concat);
                        }
                    }
                    numbers.remove(index);
                    numbers.addAll(index, newList);
                }
                break;
            }
            command = scanner.nextLine();
        }

        for (String number : numbers) {
            System.out.print(number + " ");
        }


    }
}
