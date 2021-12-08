package FinalExam5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 1;
        String distance = "[\\d]";
        String emoji = "(?<name>([\\:\\*])\\2[A-Z][a-z][a-z]+\\2\\2)";
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Pattern pattern = Pattern.compile(emoji);
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            list.add(matcher.group("name"));
        }
        Pattern pattern2 = Pattern.compile(distance);
        Matcher matcher2 = pattern2.matcher(input);
        while (matcher2.find()) {
            sum *= Integer.parseInt(matcher2.group());
        }

        int count = list.size();
        System.out.printf("Cool threshold: %d%n", sum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);
        int sum2 = 0;
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            for (int j = 0; j < a.length(); j++) {
                if ((a.charAt(j) >= 65 && a.charAt(j) <= 90) || (a.charAt(j) >= 97 && a.charAt(j) <= 122))
                    sum2 += a.charAt(j);
            }
            if (sum2 >= sum) {
                list2.add(a);
            }
            sum2 = 0;
        }

        if (list2.size() != 0) {
            for (String s : list2) {
                System.out.printf("%s%n", s);
            }
        }
    }
}
