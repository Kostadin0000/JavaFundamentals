package FinalExam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Destination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([=\\/])(?<place>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int sumLengths = 0;
        List<String> list = new ArrayList<>();


        while (matcher.find()) {
            String destination = matcher.group("place");
            sumLengths += destination.length();
            list.add(destination);
        }

        if (list.isEmpty()) {
            System.out.println("Destinations: ");
            System.out.printf("Travel Points: %d", sumLengths);
        } else {
            System.out.print("Destinations: ");
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    System.out.printf("%s%n", list.get(i));
                }else{
                System.out.printf("%s, ", list.get(i));
                }
            }
            System.out.printf("Travel Points: %d", sumLengths);
        }

    }
}
