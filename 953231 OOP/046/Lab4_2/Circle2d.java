package Lab4_2;

public class Circle2d {
    protected double x;
    protected double y;
    protected double radius;

    public Circle2d() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2d(double x_, double y_, double radius_) {
        x = x_;
        y = y_;
        radius = radius_;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
