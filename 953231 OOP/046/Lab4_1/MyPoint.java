package Lab4_1;

public class MyPoint {
    private double x, y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x_, double y_) {
        x = x_;
        y = y_;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double dist(MyPoint m) {
        return Math.sqrt(Math.pow(x - m.getX(), 2) + Math.pow(y - m.getY(), 2));
    }

    public double dist(double x_, double y_) {
        return Math.sqrt(Math.pow(x - x_, 2) + Math.pow(y - y_, 2));
    }

    public static double dist(MyPoint n, MyPoint m) {
        return Math.sqrt(Math.pow(n.getX() - m.getX(), 2) + Math.pow(n.getY() - m.getY(), 2));
    }
}
