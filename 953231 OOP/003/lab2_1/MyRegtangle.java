// 642215003 Kan Katpark
import RegtangleClass.*;

public class MyRegtangle {
    public static void main(String[] args) {
        Regtangle square = new Regtangle(5.0f,5.0f);
        System.out.println("square "+square.getWidth()+"x"+square.getHeight());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " +square.getPerimeter());

        Regtangle non_square = new Regtangle(8.0f,5.0f);
        System.out.println("non_square "+non_square.getWidth()+"x"+non_square.getHeight());
        System.out.println("Area: " + non_square.getArea());
        System.out.println("Perimeter: " +non_square.getPerimeter());
    }
}
