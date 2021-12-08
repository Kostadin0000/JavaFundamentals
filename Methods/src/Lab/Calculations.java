package Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());


        if (input.equals("add")) {
            printAdd(n, m);
        } else if (input.equals("multiply")) {
            printMultiply(n, m);
        } else if (input.equals("subtract")) {
            printSubtract(n, m);
        } else if (input.equals("divide")) {
            printDivide(n, m);
        }

    }

    private static void printDivide(int n, int m) {
        int sum = n / m;
        printsum(sum);

    }

    private static void printsum(int sum) {
        System.out.println(sum);
    }

    private static void printSubtract(int n, int m) {
        int sum = n - m;
        printsum(sum);
    }

    private static void printMultiply(int n, int m) {
        int sum = n * m;
        printsum(sum);
    }

    private static void printAdd(int n, int m) {
        int sum = n + m;
        printsum(sum);
    }

}
