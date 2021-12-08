package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Clone them!")) {
            int[] numbers = Arrays.stream(command.split("!"))
                    .mapToInt(Integer::parseInt).toArray();
            


        }
    }
}
