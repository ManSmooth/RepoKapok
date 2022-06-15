package Lab10_1.color;

import Lab9_2.GeometricObject;
import Lab9_2.Triangle;

public class driver {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[5];
        arr[0] = new Triangle(5, 5, 5, "Blue", true);
        arr[1] = new Triangle(3, 3, 3, "Red", false);
        arr[2] = new Square(4, "Yellow", false);
        arr[3] = new Square(6, "Green", true);
        arr[4] = new Square(8, "Orange", true);
        for(GeometricObject g: arr) {
            System.out.println(g);
            g.howToColor();
        }
    }
}
