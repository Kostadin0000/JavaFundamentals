package Exams.Second;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("swap")) {
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                int swapped = numbers.get(index1);
                numbers.set(index1, numbers.get(index2));
                numbers.set(index2, swapped);

            } else if (tokens[0].equals("multiply")) {
                int indexFirst = Integer.parseInt(tokens[1]);
                int indexSecond = Integer.parseInt(tokens[2]);
                int sum = numbers.get(indexFirst) * numbers.get(indexSecond);
                numbers.set(indexFirst,sum);
            }else if (tokens[0].equals("decrease")){
                for (int i = 0; i < numbers.size(); i++) {
                    int i1 = numbers.get(i) - 1;
                    numbers.set(i,i1);
                }
            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() -1){
                System.out.print(numbers.get(i));
            }else{
                System.out.print(numbers.get(i) + ", ");
            }
        }

    }
}
