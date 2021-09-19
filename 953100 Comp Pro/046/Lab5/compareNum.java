package Lab5_1;

import java.util.Scanner;

public class compareNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: "); 
        double x = input.nextDouble();
        System.out.println("Enter the second number: "); 
        double y = input.nextDouble();
        input.close();
        if (x > y) {
            System.out.println("The first number is greater than the second.");
        }
        else if (x < y) {
            System.out.println("The first number is less than the second.");
        }
        else {
            System.out.println("These two numbers are equal.");
        }
    }
}
