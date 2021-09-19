package Lab5;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hrWeek = input.nextDouble();
        System.out.print("Enter number of hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter number of federal tax withholding rate(%): ");
        double fed = input.nextDouble();
        System.out.print("Enter number of state tax withholding rate(%): ");
        double state = input.nextDouble();
        input.close();
        System.out.println("Employee's Name: " + name);
        System.out.println("Hours worked: " + hrWeek);
        System.out.println("Pay rate: $" + payRate);
        System.out.println("Gross pay: $" + payRate*hrWeek);
        System.out.println("Deductions: ");
        System.out.printf("    Federal withholding (%.1f%%): $%.2f", fed, payRate * hrWeek * (fed / 100));
        System.out.printf("\n    State withholding (%.1f%%): $%.2f", state, payRate * hrWeek * (state / 100));
        System.out.println("\n    Total Deduction: $" + payRate * hrWeek * ((state + fed) / 100));
        System.out.printf("Net pay for %s: $%.2f", name, (payRate * hrWeek) - (payRate * hrWeek * ((state + fed) / 100)));
    }
}
