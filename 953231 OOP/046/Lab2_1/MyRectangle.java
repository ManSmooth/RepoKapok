package Lab2_1;

public class MyRectangle {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(5, 5);
        Rectangle non_square = new Rectangle(8, 5);
        System.out.printf("square %s\nArea: %.1f\nPerimeter: %.1f\n\n", square, square.getArea(), square.getPerimeter());
        System.out.printf("non_square %s\nArea: %.1f\nPerimeter: %.1f\n\n", non_square, non_square.getArea(), non_square.getPerimeter());
    }
}
