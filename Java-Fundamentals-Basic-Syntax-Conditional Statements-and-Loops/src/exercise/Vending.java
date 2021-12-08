package exercise;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        double sum = 0;
        while (!output.equals("Start")) {
            double money = Double.parseDouble(output);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);

            }
            output = scanner.nextLine();
        }
        double price = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                price = 2.0;
                if (sum >= price) {
                    sum = sum - price;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                price = 0.7;
                if (sum >= price) {
                    sum = sum - price;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                price = 1.5;
                if (sum >= price) {
                    sum = sum - price;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (input.equals("Soda")) {
                price = 0.8;
                if (sum >= price) {
                    sum = sum - price;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                price = 1.0;
                if (sum >= price) {
                    sum = sum - price;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
