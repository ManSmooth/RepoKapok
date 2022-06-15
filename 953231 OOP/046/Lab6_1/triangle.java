package Lab6_1;

public class triangle extends GeometricObject {
    private double side1, side2, side3;

    public triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public triangle(double a, double b, double c) {
        side1 = a;
        side2 = b;
        side3 = c;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = getPerimeter()/2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return String.format("Triangle: side1 = %.2f side2 = %.2f side3 = %.2f", side1, side2, side3);
    }
}
