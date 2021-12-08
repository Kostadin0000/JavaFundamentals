package Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        if (input.equals("int")) {
            int n = Integer.parseInt(input1);
            int n1 = Integer.parseInt(input2);
            int max = getMax(n, n1);
            System.out.println(max);

        } else if (input.equals("char")) {
            char a = input1.charAt(0);
            char b = input2.charAt(0);
            char max = (char) getMax1(a, b);
            System.out.println(max);
        } else if (input.equals("string")) {
            String max = getMax2(input1, input2);
            System.out.println(max);

        }
    }

    private static String getMax2(String c, String d) {
        if (c.compareTo(d) >= 0) {
            return c;
        } else {
            return d;
        }
    }

    private static Object getMax1(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static int getMax(int n, int n1) {
        if (n > n1) {
            return n;
        } else {
            return n1;
        }
    }
}
