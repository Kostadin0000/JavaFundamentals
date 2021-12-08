package lab;

import java.util.Locale;
import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        if (letter.equals(letter.toLowerCase(Locale.ROOT))){
            System.out.println("lower-case");
        }else{
            System.out.println("upper-case");
        }
    }
}
