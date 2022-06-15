package Lab10_2;

public class Driver {
    public static void main(String[] args) {
        Circle a = new Circle(7);
        Circle b = new Circle(8);
        Rectangle c = new Rectangle(7, 8);
        Rectangle d = new Rectangle(8, 7);

        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        System.out.println(c.equals(d));
        System.out.println(c.compareTo(d));
    }
}
