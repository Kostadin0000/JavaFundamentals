package lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int m = i * 2 - 1;
            System.out.println(m);
            sum += m;

        }
        System.out.printf("Sum: %d", sum);
    }

}



