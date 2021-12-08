package Exams.Firsts;

import java.util.Scanner;

public class ComputerProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0;

        while (!command.equals("special") && !command.equals("regular")) {
            double item = Double.parseDouble(command);
            if (item < 0) {
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }
            sum += item;


            command = scanner.nextLine();
        }
        if (sum == 0) {
            System.out.println("Invalid order!");

        } else {

            if (command.equals("special")) {
                double withoutTaxes = sum;
                double taxes = sum * 0.2;
                double withTaxes = sum += taxes;
                double TotalPrice = withTaxes *= 0.9;
                System.out.printf("Congratulations you've just bought a new computer!%n" +
                        "Price without taxes: %.2f$%n" +
                        "Taxes: %.2f$%n" +
                        "-----------%n" +
                        "Total price: %.2f$%n", withoutTaxes, taxes, TotalPrice);
            } else {
                double withoutTaxes = sum;
                double taxes = sum * 0.2;
                double withTaxes = sum += taxes;

                System.out.printf("Congratulations you've just bought a new computer!%n" +
                        "Price without taxes: %.2f$%n" +
                        "Taxes: %.2f$%n" +
                        "-----------%n" +
                        "Total price: %.2f$%n", withoutTaxes, taxes, withTaxes);
            }
        }
    }
}