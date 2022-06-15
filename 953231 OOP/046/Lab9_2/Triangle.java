package Lab9_2;

public class Triangle extends GeometricObject {
    private double a, b, c;

    public Triangle(double aa, double bb, double cc, String Color, boolean isFilled) {
        a = aa;
        b = bb;
        c = cc;
        this.fillColor = Color;
        this.isFilled = isFilled;
    }

    public double getArea() {
        double s;
        return Math.sqrt((s = (a + b + c) / 2) * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public String toString() {
        return String.format("(%.2f, %.2f, %.2f) %s %s triangle", a, b, c, isFilled ? "Filled" : "Unfilled",
                isFilled ? fillColor : "\b");
    }

    public void howToColor() {
        System.out.println("Color all three sides");
    }
}
