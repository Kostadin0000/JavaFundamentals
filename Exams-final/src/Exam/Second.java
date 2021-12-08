package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^([$%])\\b(?<name>[A-Z][a-z]{2,})\\b\\1: (?<numbers>\\[[\\d]+\\]\\|){3}$";
        String distance = "(?<numbers>[\\d]+)";
        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        String a = "";
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");

                Pattern pattern2 = Pattern.compile(distance);
                Matcher matcher2 = pattern2.matcher(input);
                while (matcher2.find()) {
                    a += (char) Integer.parseInt(matcher2.group("numbers"));
                }
                System.out.printf("%s: %s%n",name,a);
                a = "";
            }else{
                System.out.println("Valid message not found!");
            }
        }

    }
}
