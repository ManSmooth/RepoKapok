package Lab2_1;

public class Rectangle {
    private double width, height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return width + " x " + height;
    }
}
