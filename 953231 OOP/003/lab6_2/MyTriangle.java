import java.util.Scanner;

//642115003 Kan Katpark

public class MyTriangle {
    public static void main(String[] args) {

        double x , y ,z ;
        Scanner in = new Scanner(System.in);

        System.out.print("Input side 1 : ");
        x = in.nextDouble() ;
        System.out.print("Input side 2 : ");
        y = in.nextDouble() ;
        System.out.print("Input side 3 : ");
        z = in.nextDouble() ;

        System.out.print("Input color : ");
        String color = in.next() ;

        System.out.print("Input filled (boolean)");
        boolean filled = in.nextBoolean() ;

        Triangle myTriangle = new Triangle(x,y,z);
        myTriangle.setColor(color);
        myTriangle.setFilled(filled);

        System.out.println("Area : "+ myTriangle.getArea());
        System.out.println("Perimeter : " + myTriangle.getPerimeter());

    
        System.out.println(myTriangle.toString());

    }
}
