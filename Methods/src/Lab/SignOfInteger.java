package Lab;
import java.util.Scanner;
public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printTypeOfNumber(number);
    }

    private static void printTypeOfNumber(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        }
    }

}
