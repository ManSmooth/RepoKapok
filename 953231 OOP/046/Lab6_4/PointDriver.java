package Lab6_4;

public class PointDriver {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        System.out.print("Point1 is at ");
        point1.printInfo();

        Point point2 = new Point(1, 2);
        System.out.print("Point2 is at ");
        point2.printInfo();
        System.out.println();

        if(point1.equals(point2)) {
            System.out.println("Point 1 and Point 2 are the same.\n");
        }
        else {
            System.out.println("Point 1 and Point 2 are different.\n");
        }
    }
}
