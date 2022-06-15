package Lab7_1;

public class Book extends Publication {
    private String author;

    public Book(String publisher, int pages, double price, String title, String author) {
        super(publisher, pages, price, title);
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Publisher: %s\nTitle: %s\nAuthor: %s\nPages: %d\nPrice: %.2f\n", getPublisher(), getTitle(),
                author, getPages(), getPrice());
    }
}
