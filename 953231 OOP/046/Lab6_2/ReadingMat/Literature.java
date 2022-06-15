package Lab6_2.ReadingMat;

public class Literature {
    private String title;
    private double price;
    private int pages;

    public Literature(String title, double price, int pages) {
        this.title = title;
        this.price = price;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return String.format("%s($%.2f) Pages: %d", title, price, pages);
    }
}
