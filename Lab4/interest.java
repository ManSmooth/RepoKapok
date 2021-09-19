package Lab5;
import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input investment amount: ");
        double invest = input.nextDouble();
        System.out.println("Input annual interest rate: ");
        double rate = input.nextDouble();
        System.out.println("Input number of year: ");
        double span = input.nextDouble();
        input.close();
        System.out.printf("The futre investment value is: %.2f", invest * Math.pow((1 + (rate/100)), span));
    }
}
