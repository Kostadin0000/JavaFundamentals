package Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());

        printTypeOfNumber(number);
    }

    private static void printTypeOfNumber(double number) {
        if (number >= 2.00 && number <= 2.99) {
            System.out.print("Fail");
        } else if (number >= 3.00 && number <= 3.59) {
            System.out.print("Poor");
        } else if (number >= 3.50 && number <= 4.49) {
            System.out.printf("Good");
        } else if (number >= 4.50 && number <= 5.49) {
            System.out.print("Very good");
        } else if (number >= 5.50 && number <= 6.00) {
            System.out.print("Excellent");
        }
    }
}
//•	2.00 – 2.99 - "Fail"
//•	3.00 – 3.49 - "Poor"
//•	3.50 – 4.49 - "Good"
//•	4.50 – 5.49 - "Very good"
//•	5.50 – 6.00 - "Excellent"