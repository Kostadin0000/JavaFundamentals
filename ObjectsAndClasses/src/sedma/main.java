package sedma;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Persoon> person = new ArrayList<>();
        while (!input.endsWith("End")){
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String ID = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            Persoon currentPerson = new Persoon(name,ID,age);
            person.add(currentPerson);
            input = scanner.nextLine();
        }
        List<Persoon> finalList = person.stream().
                sorted(Comparator.comparing(Persoon::getAge)).collect(Collectors.toList());
        for (Persoon persoon : finalList) {
            System.out.println(persoon);

        }
    }

}
