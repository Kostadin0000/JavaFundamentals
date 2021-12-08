package FinalExam1;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> map = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String[] tokens = input.split("\\|");
            String piece = tokens[0];
            String composer = tokens[1];
            String key = tokens[2];
            ArrayList<String> list2 = new ArrayList<>();
            list2.add(composer);
            list2.add(key);

            map.put(piece, list2);
        }
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] tokens = input.split("\\|");
            String command = tokens[0];
            if (command.equals("Add")) {
                String piece = tokens[1];
                String composer = tokens[2];
                String key = tokens[3];
                if (map.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    ArrayList<String> list3 = new ArrayList<>();
                    list3.add(composer);
                    list3.add(key);
                    map.put(piece, list3);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }
            } else if (command.equals("Remove")) {
                String piece = tokens[1];
                if (map.containsKey(piece)) {
                    System.out.printf("Successfully removed %s!%n", piece);
                    map.remove(piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            } else if (command.equals("ChangeKey")) {
                String piece = tokens[1];
                String newKey = tokens[2];
                if (map.containsKey(piece)) {
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    ArrayList<String> list4 = new ArrayList<>();
                    list4.add(map.get(piece).get(0));
                    list4.add(newKey);
                    map.put(piece, list4);

                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }


            input = scanner.nextLine();
        }
        map.entrySet().stream()
                .sorted((two, one) -> {
                    int result = two.getKey().compareTo(one.getKey());
                    return result;
                }).forEach(e -> System.out.printf("%s -> Composer: %s, Key: %s%n", e.getKey(),
                e.getValue().get(0),
                e.getValue().get(1)));

    }

}
/*
•	ChangeKey|{piece}|{new key}
o	If the piece is in the collection, change its key with the given one and print:
"Changed the key of {piece} to {new key}!"
o	If the piece is not in the collection, print:
"Invalid operation! {piece} does not exist in the collection."



 */