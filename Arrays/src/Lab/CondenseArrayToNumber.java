package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] originalArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int finalResult = 0;

        if (originalArray.length == 1) {
            System.out.printf("%d", originalArray[0]);

        } else {
            int firstLength = originalArray.length - 1;

            for (int i = 0; i < firstLength; i++) {
                int[] modifiedArray = new int[originalArray.length - 1];
                for (int j = 0; j < modifiedArray.length; j++)
                    modifiedArray[j] = originalArray[j] + originalArray[j + 1];
                originalArray = modifiedArray;
                finalResult = modifiedArray[0];
            }

            System.out.println(finalResult);
        }
    }

}
