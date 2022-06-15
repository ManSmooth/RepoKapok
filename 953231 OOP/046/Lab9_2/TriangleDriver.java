package Lab9_2;

import java.util.Scanner;

public class TriangleDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Triangle arguments:");
        Triangle T = new Triangle(s.nextInt(), s.nextInt(), s.nextInt(), s.next(),
                s.next().equalsIgnoreCase("true") ? true : false);
        System.out.println(T);
        System.out.println(T.getArea());
        System.out.println(T.getPerimeter());
        s.close();
    }
}
