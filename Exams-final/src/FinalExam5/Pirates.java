package FinalExam5;

import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            if (map.containsKey(tokens[0])) {
                for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
                    if (item.getKey().contains(tokens[0])) {
                        int newitem1 = item.getValue().get(0) + Integer.parseInt(tokens[1]);
                        int newitem2 = item.getValue().get(1) + Integer.parseInt(tokens[2]);
                        ArrayList<Integer> arraylist2 = new ArrayList<>();
                        arraylist2.add(newitem1);
                        arraylist2.add(newitem2);
                        map.put(tokens[0], arraylist2);
                    }
                }
            } else {
                ArrayList<Integer> arraylist = new ArrayList<>();
                arraylist.add(Integer.parseInt(tokens[1]));
                arraylist.add(Integer.parseInt(tokens[2]));
                map.put(tokens[0], arraylist);

            }
            input = scanner.nextLine();
        }

        String input2 = scanner.nextLine();

        while (!input2.equals("End")) {

            String[] tokens = input2.split("=>");

            if (tokens[0].equals("Plunder")) {
                String name = tokens[1];
                int people = Integer.parseInt(tokens[2]);
                int gold = Integer.parseInt(tokens[3]);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", name, gold, people);
                if (map.containsKey(name)) {
                    for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
                        if (item.getKey().equals(name)) {
                            int smetka = item.getValue().get(1) - gold;
                            int hora = item.getValue().get(0) - people;
                            if (hora <= 0 || smetka <= 0) {
                                System.out.printf("%s has been wiped off the map!%n", name);
                                map.remove(name);
                                break;
                            } else {
                                ArrayList<Integer> newlist = new ArrayList<>();
                                newlist.add(0, hora);
                                newlist.add(1, smetka);
                                map.put(name, newlist);
                            }
                        }
                    }
                }
            } else if (tokens[0].equals("Prosper")) {
                String town = tokens[1];
                int gold2 = Integer.parseInt(tokens[2]);
                if (gold2 < 0) {
                    System.out.println("Gold added cannot be a negative number!");

                } else {
                    for (Map.Entry<String, ArrayList<Integer>> item : map.entrySet()) {
                        if (item.getKey().equals(town)) {
                            int smetka = item.getValue().get(1) + gold2;
                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold2, town, smetka);
                            ArrayList<Integer> newlist = new ArrayList<>();
                            newlist.add(0, item.getValue().get(0));
                            newlist.add(1, smetka);
                            map.put(town, newlist);

                        }
                    }
                }
            }
            input2 = scanner.nextLine();
        }
        if (map.size() != 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", map.size());
            map.entrySet().stream()
                    .sorted((one, two) -> {
                        int result = two.getValue().get(1).compareTo(one.getValue().get(1));
                        if (result ==0){
                            result = one.getKey().compareTo(two.getKey());
                        }
                        return result;
                    })
                    //.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                    .forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n"
                            , e.getKey(), e.getValue().get(0), e.getValue().get(1)));

        } else {
            System.out.printf("Ahoy, Captain! All targets have been plundered and destroyed!%n");
        }
    }
}