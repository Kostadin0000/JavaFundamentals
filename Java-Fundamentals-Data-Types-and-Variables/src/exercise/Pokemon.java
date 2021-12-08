package exercise;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());


        int pokedTarget = 0;
        double half = power / 2.0;

        while (power >= distance) {
            pokedTarget++;
            power -= distance;

            if (half == power) {
                if (exhaustionFactor > 0) {
                    power /= exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(pokedTarget);
    }
}
