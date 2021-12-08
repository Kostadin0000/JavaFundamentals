package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");

            if (command.length == 3) {
                if (!list.contains(command[0])) {
                    list.add(command[0]);
                }else{
                    System.out.printf("%s is already in the list!%n",command[0]);
                }
            }else if (command.length == 4){
                if (!list.contains(command[0])) {
                    System.out.printf("%s is not in the list!%n",command[0]);
                }else{
                    list.remove(command[0]);
                }
            }
        }
        for (String s : list) {
            System.out.println(s + " ");
        }
    }
}
