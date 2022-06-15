package Lab6_2.ReadingMat;

public class Magazine extends Literature {
    private String pubU; // Publication Unit

    public Magazine(String title, double price, int pages, String pubU) {
        super(title, price, pages);
        this.pubU = pubU;
    }

    public String toString() {
        return String.format("%s\nPublishes %s", super.toString(), pubU);
    }
}
