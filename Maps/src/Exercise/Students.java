package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!map.containsKey(name)) {
                map.put(name, grade);
            } else {
                map.put(name, (map.get(name) + grade) / 2);
            }
        }

        Map<String, Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, Double> kvp : map.entrySet()) {
            if (kvp.getValue() >= 4.50) {
                averageGrade.put(kvp.getKey(), kvp.getValue());
            }
        }

        averageGrade.entrySet().stream()
                .sorted((g1, g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(grade -> {
                    System.out.println(String.format("%s -> %.2f", grade.getKey(), grade.getValue()));
                });

    }
}
