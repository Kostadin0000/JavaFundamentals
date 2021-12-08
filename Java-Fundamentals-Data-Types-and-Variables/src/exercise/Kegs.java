package exercise;

import java.util.Scanner;

public class Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        float sum = 0;
        String biggestBeer = "";
        float biggestKeg = 0;
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            sum = (float) Math.PI * radius * radius * height;
            if (sum > biggestKeg) {
                biggestKeg = sum;
                biggestBeer = model;
            }
        }
        System.out.printf("%s",biggestBeer);


    }
}
