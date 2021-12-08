package exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());


        int sum = printSum(n1, n2);
        int sum1 = printSum1(sum, n3);
        System.out.println(sum1);
    }

    private static int printSum1(int sum, int n3) {
        int sum1 = sum - n3;
        return sum1;
    }

    private static int printSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
}
