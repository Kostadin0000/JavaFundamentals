import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int entry = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        String position1 = "Left";
        String position2 = "Right";
        int leftSum = 0;
        int rightSum = 0;
        if (command.equals("cheap")) {
            for (int i = 0; i < entry; i++) {
                if (array[i] < array[entry]) {
                    leftSum += array[i];
                }

            }
            for (int i = entry + 1; i < array.length; i++) {
                if (array[i] < array[entry]) {
                    rightSum += array[i];
                }

            }
            if (leftSum > rightSum) {
                System.out.printf("%s - %d",position1,leftSum);
            }else if (leftSum < rightSum){
                System.out.printf("%s - %d",position2,rightSum);
            }else{
                System.out.printf("%s - %d",position1,leftSum);
            }

        } else if (command.equals("expensive")) {
            for (int i = 0; i < entry; i++) {
                if (array[i] >= array[entry]) {
                    leftSum += array[i];
                }
            }
            for (int i = entry + 1; i < array.length; i++) {
                if (array[i] >= array[entry]) {
                    rightSum += array[i];
                }

            }
            if (leftSum > rightSum) {
                System.out.printf("%s - %d",position1,leftSum);
            }else if (leftSum < rightSum){
                System.out.printf("%s - %d",position2,rightSum);
            }else{
                System.out.printf("%s - %d",position1,leftSum);
            }
        }
    }
}