public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        side = 0;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double s) {
        this.side = s;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}
