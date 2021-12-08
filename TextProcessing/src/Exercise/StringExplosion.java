package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        List<String> list = new ArrayList<>();


        String[] array = input.split("");


        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        int count = 0;


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(">")) {

                int destroy = Integer.parseInt(list.get(i + 1));

                for (int j = 0; j < count + destroy; j++) {
                    if (i == list.size() - 1) {
                        break;
                    }
                    if (!(list.get(i + 1).equals(">"))) {
                        list.remove(i + 1);

                    } else {
                        count = (count + destroy) - j;
                        break;
                    }
                    if (j == (count + destroy) - 1) {
                        count = 0;
                    }


                }
            }
        }
        for (String s : list) {
            System.out.print(s);
        }
    }
}
