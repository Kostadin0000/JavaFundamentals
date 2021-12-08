package Exams.Third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumbersDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = 1.0 * sum / numbers.length;


        List<Integer> nums = new ArrayList<>();
        boolean isValid = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                isValid = true;
                nums.add(numbers[i]);
            }
        }
        if (!isValid) {
            System.out.print("No");
        }


        int[] nums2 = new int[nums.size()];

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums.get(i);

        }

        int temp = 0;

        for (int i = 0; i < nums2.length; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[i] <= nums2[j]) {
                    temp = nums2[i];
                    nums2[i] = nums2[j];
                    nums2[j] = temp;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < nums2.length; i++) {
            if (count == 5) {
                break;
            }
            System.out.print(nums2[i] + " ");
            count++;

        }

    }
}
