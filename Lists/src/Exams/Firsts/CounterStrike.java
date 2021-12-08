package Exams.Firsts;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short energy = Short.parseShort(scanner.nextLine());
        String command = scanner.nextLine();
        int count = 0;
        boolean isValid = false;
        while (!command.equals("End of battle")) {
            short distance = Short.parseShort(command);

            if (energy >= distance) {
                energy -= distance;
                count++;

                if (count % 3 == 0) {
                    energy += count;
                }

            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",
                        count, energy);
                isValid = true;
                break;
            }


            command = scanner.nextLine();
        }
        if (!isValid) {
            System.out.printf("Won battles: %d. Energy left: %d", count, energy);
        }
    }
}
