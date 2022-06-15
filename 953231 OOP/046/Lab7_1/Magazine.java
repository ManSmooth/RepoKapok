package Lab7_1;

public class Magazine extends Publication {
    private String pubU; //Publication Unit

    public void setPubU(String pubU) {
        this.pubU = pubU;
    }

    public String getPubU() {
        return pubU;
    }

    public Magazine(String publisher, int pages, double price, String title, String pubU) {
        super(publisher, pages, price, title);
        this.pubU = pubU;
    }

    @Override
    public void print() {
        System.out.printf("%s\nPublisher: %s\nTitle: %s\nPages: %d\nPrice: %.2f\n", pubU, getPublisher(), getTitle(),
                getPages(), getPrice());
    }
}
