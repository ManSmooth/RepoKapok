package Lab6_1;

public class triangleTest {
    public static void main(String[] args) {
        triangle T = new triangle(3, 6, 7);
        T.setColor("Azure");
        T.setFilled(true);

        System.out.println(T);
        System.out.println(T.getArea());
        System.out.println(T.getPerimeter());
        System.out.println(T.getColor());
        System.out.println(T.isFilled());
    }
}
