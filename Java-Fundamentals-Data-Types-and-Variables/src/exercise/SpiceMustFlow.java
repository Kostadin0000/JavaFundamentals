package exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum = 0;
        int days = 0;
        if (yield >= 100) {
        while (yield >= 100) {
            sum = yield - 26;
            yield -= 10;
            sum1 += sum;
            days++;
        }
        sum1 -= 26;
    }
        System.out.println(days);
        System.out.println(sum1);

    }
}
