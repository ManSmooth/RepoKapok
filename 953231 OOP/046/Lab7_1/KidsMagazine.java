package Lab7_1;

public class KidsMagazine extends Magazine {
    private int ageRangeStart;
    private int ageRangeEnd;

    public KidsMagazine(String publisher, int pages, double price, String title, String pubU, int s, int e) {
        super(publisher, pages, price, title, pubU);
        this.ageRangeStart = s;
        this.ageRangeEnd = e;
    }

    @Override
    public void print() {
        System.out.printf("%s[%d-%d]\nPublisher: %s\nTitle: %s\nPages: %d\nPrice: %.2f\n", getPubU(),
                ageRangeStart, ageRangeEnd, getPublisher(), getTitle(), getPages(), getPrice());
    }
}
