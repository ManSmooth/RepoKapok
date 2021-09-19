package Lab9;

import java.util.Scanner;

public class dist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1: ");
        double x1 = in.nextDouble();
        System.out.print("y1: ");
        double y1 = in.nextDouble();
        System.out.print("x2: ");
        double x2 = in.nextDouble();
        System.out.print("y2: ");
        double y2 = in.nextDouble();
        System.out.printf("Distance: %.4f", distance(x1, y1, x2, y2));
        in.close();
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
