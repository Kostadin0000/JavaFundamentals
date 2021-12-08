package exercise;

import java.util.Scanner;

public class PrintPartOfTheASCiiOfTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        for (int i = n; i <= p; i++) {

            char c =  (char) i;
            System.out.print(c + " ");

        }
    }
}
