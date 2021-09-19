package Lab9;

import java.util.Scanner;

public class tempConv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Convert to (C/F): ");
        char menu = in.next().toLowerCase().charAt(0);
        System.out.print("Enter " + (menu == 'c'? "Fahrenheit": (menu == 'f'? "Celcius": "(INVALID INPUT ERROR)")) + ": ");
        double temp = in.nextDouble();
        in.close();
        double z;
        System.out.printf((z = conversion(menu, temp)) == Double.MAX_VALUE? "INVALID INPUT ERROR": "%.2f", z);
    }
    public static double conversion(char key, double in) {
        if(key == 'c') {
            return (in - 32.0) * (5.0 / 9.0);
        }
        else if(key == 'f') {
            return ((9.0 * in) / 5.0) + 32.0;
        }
        else {
            return Double.MAX_VALUE;
        }
    }
}
