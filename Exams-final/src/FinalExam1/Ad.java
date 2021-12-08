package FinalExam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([|#])(?<item>[A-Za-z ]+)\\1(?<date>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<calories>[\\d]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> allGoods = new ArrayList<>();

        int total = 0;
        while (matcher.find()) {
            allGoods.add(String.format("Item: %s, Best before: %s, Nutrition: %s",
                    matcher.group("item"), matcher.group("date"), matcher.group("calories")));
            total += Integer.parseInt(matcher.group("calories"));
        }
        int day = total / 2000;
        System.out.println("You have food to last you for: " + day + " days!");
        for (String s : allGoods) {
            System.out.println(s);
        }



    }
}
/*
int sum = 0;
        while (matcher.find()) {
            int calories = Integer.parseInt(matcher.group("calories"));
            sum += calories;
        }
        int sum2 = sum / 2000;
        System.out.printf("You have food to last you for: %d days!%n", sum2);
        while (matcher.find()) {
            String itemName = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            sum += calories;
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",itemName,date,calories);
        }
 */