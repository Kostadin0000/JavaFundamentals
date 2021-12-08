package Exams.Second;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int maxPeople = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        int maxWagon = 4;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < maxWagon) {
                if (maxPeople - maxWagon <= 0) {
                    if (maxPeople + numbers.get(i) <= maxWagon) {
                        numbers.set(i, maxPeople + numbers.get(i));
                        maxPeople -= maxPeople;
                    } else {
                        int a = maxPeople - numbers.get(i);
                        numbers.set(i, numbers.get(i) + a);
                        maxPeople -= a;
                    }
                    continue;
                }
                sum = maxPeople - (maxPeople - (maxWagon - numbers.get(i)));
                numbers.set(i, numbers.get(i) + sum);
                maxPeople -= sum;
            }
        }

        boolean isValid = false;

        if (maxPeople <= 0) {

            for (Integer integer : numbers) {
                if (integer < maxWagon) {
                    isValid = true;
                    break;
                }
            }

            if (isValid) {
                System.out.println("The lift has empty spots!");
                for (Integer number : numbers) {
                    System.out.print(number + " ");
                }

            } else {
                for (Integer number : numbers) {
                    System.out.print(number + " ");
                }
            }

        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", maxPeople);
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
