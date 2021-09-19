package Lab5_1;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: "); 
        double hour = input.nextDouble();
        input.close();
        System.out.printf("Weekly salary is $%.2f", hour > 40 ? 320 + 12 * (hour - 40) : 8 * hour);
    }
}
