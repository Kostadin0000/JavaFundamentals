package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Frming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

        Map<String, Integer> maps = new LinkedHashMap<>();
        Map<String, Integer> maps2 = new TreeMap<>();
        maps.put("shards", 0);
        maps.put("motes", 0);
        maps.put("fragments", 0);
        boolean check = false;

        String[] array = input.split(" ");
        while (!check) {


        for (int i = 0; i < array.length; i++) {

            if (!maps.containsKey(array[i + 1])) {
                maps.put(array[i + 1], Integer.parseInt(array[i]));
            } else {
                maps.put(array[i + 1], maps.get(array[i + 1]) + Integer.parseInt(array[i]));
            }

            if (array[i + 1].equals("shards")) {
                if (maps.get(array[i + 1]) >= 250) {
                    System.out.print("Shadowmourne obtained!");
                    int av = maps.get(array[i + 1]) - 250;
                    maps.put(array[i + 1], av);

                    break;
                }
            } else if (array[i + 1].equals("motes")) {
                if (maps.get(array[i + 1]) >= 250) {
                    System.out.print("Dragonwrath obtained!");
                    int av = maps.get(array[i + 1]) - 250;
                    maps.put(array[i + 1], av);

                    break;
                }

            } else if (array[i + 1].equals("fragments")) {
                if (maps.get(array[i + 1]) >= 250) {
                    System.out.print("Valanyr obtained!");
                    int av = maps.get(array[i + 1]) - 250;
                    maps.put(array[i + 1], av);

                    break;
                }
            }
            i++;
        }
        input = scanner.nextLine().toLowerCase();
    }


        maps2.put("motes", maps.get("motes"));
        maps2.put("fragments", maps.get("fragments"));
        maps2.put("shards", maps.get("shards"));
        maps.remove("motes");
        maps.remove("fragments");
        maps.remove("shards");

        maps2.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));

        maps.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));
    }
}

