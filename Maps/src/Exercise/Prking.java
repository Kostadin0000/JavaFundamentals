package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Prking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("register")) {
                String name = tokens[1];
                String plate = tokens[2];

                if (!map.containsKey(name)) {
                    System.out.printf("%s registered %s successfully%n", name, plate);
                    map.put(name, plate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", map.get(name));
                }


            }else if (tokens[0].equals("unregister")){
                String name = tokens[1];
                if (!map.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);
                }else{
                    System.out.printf("%s unregistered successfully%n",name);
                    map.remove(name);
                }
            }
        }
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.printf("%s => %s%n",stringStringEntry.getKey(),stringStringEntry.getValue());
        }
    }
}
