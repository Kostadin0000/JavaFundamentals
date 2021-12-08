package Exam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Statistics")) {
            String[] tokens = input.split("=");
            String command = tokens[0];

            if (command.equals("Add")) {
                String username = tokens[1];
                int sent = Integer.parseInt(tokens[2]);
                int received = Integer.parseInt(tokens[3]);
                if (!map.containsKey(username)) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(sent);
                    list.add(received);
                    map.put(username, list);
                }
            } else if (command.equals("Message")) {
                String sender = tokens[1];
                String receiver = tokens[2];
                if (map.containsKey(sender) && map.containsKey(receiver)) {
                    map.get(sender).set(0, map.get(sender).get(0) + 1);
                    map.get(receiver).set(1, map.get(receiver).get(1) + 1);
                    if (map.get(sender).get(0) + map.get(sender).get(1)>= capacity) {
                        System.out.printf("%s reached the capacity!%n", sender);
                        map.remove(sender);
                    }

                    if (map.get(receiver).get(1) + map.get(receiver).get(0) >= capacity) {
                        System.out.printf("%s reached the capacity!%n", receiver);
                        map.remove(receiver);
                    }

                }
            } else if (command.equals("Empty")) {
                String name = tokens[1];
                if (map.containsKey(name)) {
                    map.remove(name);
                }
                if (name.equals("All")) {
                    map.clear();
                }
            }


            input = scanner.nextLine();
        }
        System.out.printf("Users count: %d%n", map.size());
        map.entrySet().stream()
                .sorted((one, two) -> {
                    int result = two.getValue().get(1).compareTo(one.getValue().get(1));
                    if (result == 0) {
                        result = one.getKey().compareTo(two.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue().get(0) + e.getValue().get(1)));

    }
}
