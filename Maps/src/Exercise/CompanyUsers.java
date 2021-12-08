package Exercise;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, List<String>> companyUsers = new TreeMap<>();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+->\\s+");
            String companyName = tokens[0];
            String employeeID = tokens[1];
            if (!companyUsers.containsKey(companyName)) {
                companyUsers.put(companyName, new ArrayList<>());
            }
            if (!companyUsers.get(companyName).contains(employeeID)) {
                companyUsers.get(companyName).add(employeeID);
            }
            input = scanner.nextLine();
        }


        for (String s : companyUsers.keySet()) {
            System.out.printf("%s\n", s);
            for (int i = 0; i < companyUsers.get(s).size(); i++) {
                System.out.printf("-- %s\n", companyUsers.get(s).get(i));
            }
        }

    }
}