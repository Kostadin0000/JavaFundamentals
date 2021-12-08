package exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tank = 255;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            sum += litres;
            if (sum > 255) {
                sum-=litres;
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.printf("%d",sum);
    }
}
