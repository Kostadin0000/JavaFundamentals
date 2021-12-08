package lab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double V = 0;
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double h = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        V = (length * width * h) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);

    }
}
