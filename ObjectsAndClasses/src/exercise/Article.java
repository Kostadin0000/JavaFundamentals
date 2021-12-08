package exercise;


public class Article {
    String getTitle() {
        return title;
    }

    String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    String title;
    String content;
    String author;

    Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s%n", this.title, this.content, this.author);
    }
}
