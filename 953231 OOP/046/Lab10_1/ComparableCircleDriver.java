package Lab10_1;

public class ComparableCircleDriver {

    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(1.0, 1.0, 3.0);
        ComparableCircle c2 = new ComparableCircle(1.0, 1.0, 4.0);
        System.out.println(c1.compareTo(c2) == 0? "Equal": c1.compareTo(c2) > 0? "More than": "Less than");
    }
}
