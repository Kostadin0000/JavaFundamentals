package lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = Integer.parseInt(scanner.nextLine());
        double sum = money * 1.31;
        System.out.printf("%.3f",sum);
    }
}
