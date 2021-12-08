package lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        BigDecimal sum = new BigDecimal("0");
        for (int i = 0; i < n; i++) {
            String n1 = scanner.nextLine();
            BigDecimal number = new BigDecimal(n1);
             sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
