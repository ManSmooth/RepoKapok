package Lab5_1;

import java.util.Scanner;

public class tempConv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert to Celsius(C) or Fahrenheit(F): "); 
        char cont = input.next().toLowerCase().charAt(0); 
        System.out.printf("Enter %s: ", cont == 'c' ? "Fahrenheit" : cont == 'f' ? "Celsius" : "Unexpected input error."); 
        double temp = input.nextDouble();
        input.close();
        System.out.printf("\nThe Converted Temperature is: %.4f%s", cont == 'c' ? (temp - 32) * 5 / 9 : cont == 'f' ? (9 * temp / 5) + 32 : 0.00, cont == 'c' ? "°C" : cont == 'f' ? "°F" : " Unexpected input error.");
    }
}
