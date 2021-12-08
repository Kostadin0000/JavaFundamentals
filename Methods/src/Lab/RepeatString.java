package Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String output = printResult(input,n);
    }

    private static String printResult(String input, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(input);
        }
        return input;
    }
}
