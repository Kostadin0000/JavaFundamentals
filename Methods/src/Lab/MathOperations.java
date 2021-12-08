package Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int n1 = Integer.parseInt(scanner.nextLine());
        if (operator.equals("/")) {
            int max = getResult(n, n1);
            System.out.println(max);
        } else if (operator.equals("*")) {
            int max = getResult1(n, n1);
            System.out.println(max);
        } else if (operator.equals("+")) {
            int max = getResult2(n, n1);
            System.out.println(max);
        } else if (operator.equals("-")) {
            int max = getResult3(n, n1);
            System.out.println(max);
        }


    }

    private static int getResult3(int n, int n1) {
        return n - n1;
    }

    private static int getResult2(int n, int n1) {
        return n + n1;
    }

    private static int getResult1(int n, int n1) {
        return n * n1;
    }

    private static int getResult(int n, int n1) {
        return n / n1;
    }
}
