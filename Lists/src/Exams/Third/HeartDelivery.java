package Exams.Third;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        int index2 = 0;
        int indexator = 0;
        while (!command.equals("Love!")) {

            String[] tokens = command.split("\\s+");

            int index = Integer.parseInt(tokens[1]);
            index2 += index;

            if (index2 >= numbers.length) {
                index2 = 0;
            }

            for (int i = 0; i < numbers.length; i++) {
                if (i == index2) {
                    numbers[i] -= 2;
                    indexator = i;
                    if (numbers[i] < 0) {
                        numbers[i] = 0;
                        if (numbers[i] == 0) {
                            System.out.printf("Place %d already had Valentine's day.%n", i);
                            break;
                        }
                    }
                    if (numbers[i] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", indexator);
                        break;
                    }
                }

            }
            command = scanner.nextLine();
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                count++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", indexator);
        if (count != 0) {
            System.out.printf("Cupid has failed %d places.%n", count);
        } else {
            System.out.println("Mission was successful.");
        }

    }
}
