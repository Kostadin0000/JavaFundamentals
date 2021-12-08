package Exams.Second;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals("End")) {

            int num = Integer.parseInt(command);

            if (num >= 0 && num < numbers.length) {
                count++;
                int removed = numbers[num];
                numbers[num] = -1;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == -1) {
                        continue;
                    } else {
                        if (removed < numbers[i]) {
                            numbers[i] -= removed;
                        } else {
                            numbers[i] += removed;
                        }
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d" + " ", numbers[i]);
        }
    }
}
