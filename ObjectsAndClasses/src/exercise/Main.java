package exercise;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String command = scanner.nextLine();
        if (command.equals("title")) {
            articles.sort(Comparator.comparing(Article::getTitle));
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("content")) {
            articles.sort(Comparator.comparing(Article::getContent));
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("author")) {
            articles.sort(Comparator.comparing(Article::getAuthor));
            System.out.print(articles.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
