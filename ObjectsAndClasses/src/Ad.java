import java.util.Random;
import java.util.Scanner;

public class Ad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rand = new Random();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            int a = rand.nextInt(phrases.length);
            int b = rand.nextInt(events.length);
            int c = rand.nextInt(authors.length);
            int d = rand.nextInt(cities.length);
            System.out.printf("%s %s %s - %s%n",phrases[a],events[b],authors[c],cities[d]);
        }
//{phrase} {event} {author} – {city}.
    }
}
