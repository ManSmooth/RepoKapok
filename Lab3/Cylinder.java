package Lab3;
import java.util.Scanner;
    //----------Lab 3 
    //----------Sarin 642115046
    //This program for calculating the volume of a cylinder
public class Cylinder {
    public static void main(String[] args) {
        float radius;
        float length;
        Scanner in = new Scanner(System.in);
        System.out.println("Input radius:");
        radius = in.nextFloat();
        System.out.println("Input length:");
        length = in.nextFloat();
        in.close();
        System.out.printf("The volume of the cylinder is equal to %.2f", radius * radius * Math.PI * length);
    }
}
