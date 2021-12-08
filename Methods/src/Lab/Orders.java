package Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (input.equals("coffee")) {
            price = 1.50;
            printCoffee(price, n);
        } else if (input.equals("water")) {
            price = 1.00;
            printWater(price, n);
        } else if (input.equals("coke")) {
            price = 1.40;
            printCoke(price, n);
        } else if (input.equals("snacks")) {
            price = 2.00;
            printSnacks(price, n);
        }
    }

    private static void printSnacks(double price, int n) {
        double sum = price * n;
        System.out.printf("%.2f", sum);
    }

    private static void printCoke(double price, int n) {
        double sum = price * n;
        System.out.printf("%.2f", sum);
    }

    private static void printWater(double price, int n) {
        double sum = price * n;
        System.out.printf("%.2f", sum);
    }

    static void printCoffee(double price, int n) {
        double sum = price * n;
        System.out.printf("%.2f", sum);
    }


}
