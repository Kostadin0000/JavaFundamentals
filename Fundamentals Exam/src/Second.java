import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        int lostNames = 0;

        int blacklistedNames = 0;

        while (!command.equals("Report")) {
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("Blacklist")) {
                String name = tokens[1];
                if (names.contains(name)) {
                    System.out.printf("%s was blacklisted.%n", name);
                    names.set(names.indexOf(name), "Blacklisted");
                    blacklistedNames++;
                } else {
                    System.out.printf("%s was not found.%n", name);
                }
            } else if (tokens[0].equals("Error")) {
                int index = Integer.parseInt(tokens[1]);
                if (!(names.get(index).equals("Lost"))) {
                    if (!(names.get(index).equals("Blacklisted"))) {
                        System.out.printf("%s was lost due to an error.%n", names.get(index));
                        names.set(index, "Lost");
                        lostNames++;
                    }
                }


            } else if (tokens[0].equals("Change")) {
                int index2 = Integer.parseInt(tokens[1]);
                String newName = tokens[2];
                if (index2 >= 0 && index2 < names.size()) {
                    System.out.printf("%s changed his username to %s.%n", names.get(index2), newName);
                    names.set(index2, newName);
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blacklistedNames);
        System.out.printf("Lost names: %d%n", lostNames);
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
