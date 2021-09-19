import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        final double PI = 3.1428 ; 
        double radius ;
        double length;
        double area;
        double volume;

        Scanner input = new Scanner(System.in);
        System.out.print("Input radius: ");
        radius = input.nextDouble();
        System.out.print("Input length: ");
        length = input.nextDouble();

        area = Math.pow(radius, 2) * PI;
        volume = area * length ;

        System.out.println("The area is "+area);
        System.out.print("The volume is "+volume);

    }
}
