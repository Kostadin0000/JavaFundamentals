package exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double f1 = getFactorialOfFirstNumber(n);
        double f2 = getFactorialOfSecondNumber(m);
        printDivide(f1,f2);
    }
    private static void printDivide(double f1, double f2) {
        System.out.printf("%.2f",f1/f2);
    }
    private static double getFactorialOfSecondNumber(double m) {
        double sum = 1.0;
        for (double i = m; i >= 1; i--) {
            sum *= i;
        }
        return sum;
    }
    private static double getFactorialOfFirstNumber(double n) {
        double sum = 1;
        for (double i = n; i >= 1; i--) {
            sum *= i;
        }
        return sum;
    }
}
