package Exercise;

import java.lang.reflect.Array;
import java.util.*;

public class courses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new TreeMap<>();

        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("end")) {

            String[] splitCommand = command.split(" : ");
            String courseName = splitCommand[0];
            String user = splitCommand[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(user);
            } else {
                if (!courses.get(courseName).contains(user)) {
                    courses.get(courseName).add(user);
                }
            }
            command = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.println("-- " + student));
                });

    }
}
