package lab;

import java.util.Scanner;

public class FixSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int m = 2*i -1;
            System.out.println(m);
            sum += m;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
