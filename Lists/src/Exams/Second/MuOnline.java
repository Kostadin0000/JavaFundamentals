package Exams.Second;

import java.util.Arrays;
import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|+");
        int sumOfBitcoins = 0;
        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i < rooms.length; i++) {
            bitcoins = 0;
            String[] tokens = rooms[i].split("\\s+");
            String command = tokens[0];
            int number = Integer.parseInt(tokens[1]);

            if (command.equals("potion")) {
                if ((health + number) < 100) {
                    health += number;
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                } else if ((health + number) > 100) {
                    System.out.printf("You healed for %d hp.%n", 100 - health);
                    health = 100;
                    System.out.printf("Current health: %d hp.%n", health);
                }
            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", bitcoins);
            } else {
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    break;
                }

            }
            sumOfBitcoins += bitcoins;
        }
        if (health > 0) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", sumOfBitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
