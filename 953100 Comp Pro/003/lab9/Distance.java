import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance;
        System.out.print("Enter x1 :");
        double x1 = input.nextDouble();
        System.out.print("Enter x2 :");
        double x2 = input.nextDouble();
        System.out.print("Enter y1 :");
        double y1 = input.nextDouble();
        System.out.print("Enter y2 :");
        double y2 = input.nextDouble();

        distance = calculation( x1, x2, y1, y2);
        
        System.out.println("Distance between ("+x1 +","+y1+") and ("+x2+","+y2 + ") is " + distance);
    }


    public static double calculation(double i1,double i2,double j1,double j2){
        double result;
        double x , y ,temp;
        x = i2 - i1;
        y = j2 - j1;
        temp = Math.pow(x, 2) + Math.pow(y, 2) ;
        result= Math.sqrt(temp);
        
        return result;
    }
}
