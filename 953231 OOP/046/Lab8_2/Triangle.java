package Lab8_2;

public class Triangle {
    private double a, b, c;

    public Triangle(double na, double nb, double nc) {
        a = na;
        b = nb;
        c = nc;
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException(String.format("Invalid Triangle (%.2f, %.2f, %.2f)", a, b, c));
        }
    }

    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", a, b, c);
    }
}

class IllegalTriangleException extends RuntimeException {
    IllegalTriangleException() {
        super();
    }

    IllegalTriangleException(String message) {
        super(message);
    }
}
