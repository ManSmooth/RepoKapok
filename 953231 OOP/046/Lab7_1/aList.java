package Lab7_1;

import java.util.ArrayList;

public class aList {
    public static void main(String[] args) {
        ArrayList<Object> aList = new ArrayList<Object>();
        aList.add(new Loan() {
            public String toString() {
                return "Loan!";
            }
        });
        aList.add(new java.util.Date());
        aList.add(new String("String!"));
        aList.add(new Lab4_2.Circle2d(0, 0, 5) {
            public String toString() {
                return String.format("Circle at (%.1f, %.1f) with radius %.1f", getX(), getY(), getRadius());
            }
        });
        for (Object object : aList) {
            System.out.println(object);
        }
    }
}

interface Loan {}
