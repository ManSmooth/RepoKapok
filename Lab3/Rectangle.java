package Lab3;
import java.util.Scanner;
    //----------Lab 3 
    //----------Sarin 642115046
    //This program for calculate the area of regtangle
public class Rectangle {
    public static void main(String[] args) {
        float length;
        float width;
        float area;
        Scanner input = new Scanner(System.in);
        System.out.println("Input length: ");
        length = input.nextFloat();
        System.out.println("Input width: ");
        width = input.nextFloat();
        area = length * width;
        input.close();
        System.out.printf("The area of regtangle is %.2f",area);
    }
}
