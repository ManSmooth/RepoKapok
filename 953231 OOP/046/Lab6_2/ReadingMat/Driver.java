package Lab6_2.ReadingMat;

public class Driver {
    public static void main(String[] args) {
        Novel n = new Novel("Alone", 49.99, 200, "Alone in the world of darkness.");
        n.addChar("Charlie");
        n.addChar("Charlotte");
        System.out.println(n);

        Magazine m = new Magazine("Fix4U", 3.99, 20, "Biweekly");
        System.out.println(m);
    }
}
