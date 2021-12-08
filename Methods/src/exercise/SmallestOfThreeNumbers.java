package exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());

        printSum(n, m, z);
    }

    private static void printSum(int n, int m, int z) {

        if (n <= m && n <= z) {
            System.out.println(n);
        } else if (m <= n && m <= z) {
            System.out.println(m);
        } else {
            System.out.println(z);
        }
    }


}
