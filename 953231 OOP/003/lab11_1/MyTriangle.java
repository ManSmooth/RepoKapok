import java.util.* ;
public class MyTriangle {
    public static void main(String[] args) {
        double side1 ;
        double side2 ;
        double side3 ;
        String color ;
        boolean isFilled ;

        Scanner in = new Scanner(System.in) ;

        System.out.print("Enter side1:");
        side1 = in.nextDouble();
        System.out.print("Enter side2:");
        side2 = in.nextDouble();
        System.out.print("Enter side3:");
        side3 = in.nextDouble();

        System.out.print("Enter color :");
        color = in.next() ;

        System.out.print("Enter is filled : ");
        isFilled = in.nextBoolean() ;
        in.close();
        Triangle t1 = new Triangle(side1, side2, side3, color, isFilled);
        
        System.out.println("Triangle " + t1.toString());
        System.out.println("Color: " + t1.getColor() + " isFilled: "+ t1.isFilled());
        System.out.println("Area: "  + t1.getArea() + " Perimeter: " + t1.getPerimeter());

    }
}
