package Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());


        for (int index = 0; index <= numbers.size() - 1 ; index++) {
            if (numbers.get(index) < 0 ){
                numbers.remove(index);
                index = -1;
            }
        }

        Collections.reverse(numbers);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        if (numbers.size() == 0){
            System.out.println("empty");
        }
    }

}
