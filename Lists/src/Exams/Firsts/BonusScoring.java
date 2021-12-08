package Exams.Firsts;

import java.util.Scanner;

public class BonusScoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double students = Double.parseDouble(scanner.nextLine());
        double lectures = Double.parseDouble(scanner.nextLine());
        double bonus = Double.parseDouble(scanner.nextLine());

        double maxBonus = 0.0;
        double min = Double.MIN_VALUE;

        int a = 0;
        for (int i = 0; i < students; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            maxBonus = (attendances / lectures) * (5 + bonus);
            if (maxBonus > min) {
                min = maxBonus;
                a = attendances;
            }
        }
        Math.round(min);
        System.out.printf("Max Bonus: %.0f.%n", min);
        System.out.printf("The student has attended %d lectures.", a);
    }
}
