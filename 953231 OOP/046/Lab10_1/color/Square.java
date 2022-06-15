package Lab10_1.color;

public class Square extends Lab9_2.GeometricObject {
    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean isFilled) {
        this.side = side;
        this.fillColor = color;
        this.isFilled = isFilled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public String toString() {
        return String.format("(%.2f) %s %s Square", side, isFilled ? "Filled" : "Unfilled",
                isFilled ? fillColor : "\b");
    }
}
