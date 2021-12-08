package exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = num1; num1 <= num2; num1++) {
            System.out.print(num1 + " ");
            sum += num1;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
