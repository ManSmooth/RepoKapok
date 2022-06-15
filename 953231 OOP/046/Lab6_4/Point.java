package Lab6_4;

public class Point {
    private double x;
    private double y;

    public Point(double nx, double ny) {
        x = nx;
        y = ny;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public boolean equals(Point p) { 
        return x == p.getX() && y == p.getY();
    }

    public void printInfo() {
        System.out.printf("(%.1f, %.1f)\n", x, y);
    }
}
