package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //символ -> брой на срещанията
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == ' ') {
                continue;
            }
            if(!lettersCount.containsKey(currentSymbol)) {
                //не сме срещали до сега символа
                lettersCount.put(currentSymbol, 1);
            } else {
                //вече сме срещали символа
                lettersCount.put(currentSymbol, lettersCount.get(currentSymbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            //{'t': 2}
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
