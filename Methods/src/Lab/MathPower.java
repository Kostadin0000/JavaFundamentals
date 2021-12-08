package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        double sum = getSum(n, m);

        System.out.println(new DecimalFormat("0.####").format(sum));
    }

    private static double getSum(double n, int m) {
        double sum = Math.pow(n, m);
        return  sum;
    }
}
