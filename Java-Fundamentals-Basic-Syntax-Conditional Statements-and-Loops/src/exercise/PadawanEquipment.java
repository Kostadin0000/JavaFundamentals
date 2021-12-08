package exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());


        int freeBelts = (countOfStudents / 6);
        double sum = priceOfBelts * (countOfStudents - freeBelts);
        double sum1 = countOfStudents * priceOfSabers;
        double sum3 = Math.ceil(countOfStudents * 0.10)* priceOfSabers;
        double sum2 = countOfStudents * priceOfRobes;
        double sum4 = sum + sum1 + sum3 + sum2;
        if (money >=sum4) {
            System.out.printf("The money is enough - it would cost %.2flv.",sum4);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.",sum4-money);
        }

    }
}