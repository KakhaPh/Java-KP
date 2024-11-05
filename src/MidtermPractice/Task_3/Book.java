package MidtermPractice.Task_3;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String BookDetails() {
        return "სათაური: " + title + " ავტორი: " + author;
    }
}
