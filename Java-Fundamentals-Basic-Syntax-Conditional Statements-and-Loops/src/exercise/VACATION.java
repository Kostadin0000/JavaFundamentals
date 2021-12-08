package exercise;

import java.util.Scanner;

public class VACATION {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0.0;

        if (typeOfGroup.equals("Students")) {
            if (day.equals("Friday")) {
                sum = groupNumber * 8.45;
            } else if (day.equals("Saturday")) {
                sum = groupNumber * 9.80;
            } else if (day.equals("Sunday")) {
                sum = groupNumber * 10.46;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")) {
                sum = groupNumber * 10.90;
            } else if (day.equals("Saturday")) {
                sum = groupNumber * 15.60;
            } else if (day.equals("Sunday")) {
                sum = groupNumber * 16.00;
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                sum = groupNumber * 15.00;
            } else if (day.equals("Saturday")) {
                sum = groupNumber * 20.00;
            } else if (day.equals("Sunday")) {
                sum = groupNumber * 22.50;
            }
        }
        if (typeOfGroup.equals("Students") && groupNumber >= 30) {
            sum *= 0.85;
        } else if (typeOfGroup.equals("Business") && groupNumber >= 100) {
            if (day.equals("Friday")) {
                sum = (groupNumber-10) * 10.90;
            } else if (day.equals("Saturday")) {
                sum = (groupNumber-10) * 15.60;
            } else if (day.equals("Sunday")) {
                sum = (groupNumber-10) * 16.00;
            }
        } else if (typeOfGroup.equals("Regular") && groupNumber >= 10 && groupNumber <= 20) {
            sum *= 0.95;
        }
        System.out.printf("Total price: %.2f",sum);
    }

}
