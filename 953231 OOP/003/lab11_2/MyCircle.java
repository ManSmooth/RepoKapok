//642115003 Kan Katpark

public class MyCircle {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(9);
        ComparableCircle c2 = new ComparableCircle(8);
        ComparableCircle c3 = new ComparableCircle(8);

        System.out.println(c1.compareTo(c2));
        System.out.println(c3.compareTo(c2));
        System.out.println(c3.compareTo(c1));
    }
}
