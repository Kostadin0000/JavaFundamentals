package Exercise;

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder bob = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int a = input.charAt(i) + 3;
            bob.append((char) a);

        }
        System.out.println(bob);
    }
}
