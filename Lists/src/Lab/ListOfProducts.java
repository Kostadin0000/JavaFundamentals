package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> vegetables = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String vegatable = scanner.nextLine();
            vegetables.add(vegatable);
        }

        Collections.sort(vegetables);
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.printf("%d.%s%n", i+1, vegetables.get(i));
        }
    }
}
