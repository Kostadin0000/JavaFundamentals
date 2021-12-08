package FinalExam2;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, List<Double>> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("<->");
            String plantName = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);
            if (map.containsKey(plantName)) {
                map.put(plantName, rarity);
            } else {
                map.put(plantName, rarity);
            }
            map2.putIfAbsent(plantName, new ArrayList<>());
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String[] tokens = input.split(": ");
            String command = tokens[0];
            if (command.equals("Rate")) {
                String[] tokens2 = tokens[1].split(" - ");
                String name = tokens2[0];
                double rate = Double.parseDouble(tokens2[1]);
                map2.get(name).add(rate);
            } else if (command.equals("Update")) {
                String[] tokens2 = tokens[1].split(" - ");
                String name1 = tokens2[0];
                int rating1 = Integer.parseInt(tokens2[1]);
                map.put(name1, rating1);
            } else if (command.equals("Reset")) {
                String name3 = tokens[1];
                map2.get(name3).clear();
            } else {
                System.out.println("error");
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparingDouble(x -> map2.get(x.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0))
                        .reversed())
                .forEach(e -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", e.getKey(), e.getValue(),
                        map2.get(e.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0)));
    }
}
