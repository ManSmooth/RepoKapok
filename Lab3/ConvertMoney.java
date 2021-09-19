package Lab3;
import java.util.Scanner;
    //----------Lab 3 
    //----------Sarin 642115046
    //This program for converting currency
public class ConvertMoney {
    public static void main(String[] args) {
        float baht;
        Scanner in = new Scanner(System.in);
        System.out.println("Input baht:");
        baht = in.nextFloat();
        in.close();
        System.out.printf("The Result is: $%.2f", baht / 31.8245);
    }
}
