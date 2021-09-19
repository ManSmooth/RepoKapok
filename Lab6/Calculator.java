package Lab6;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("If x = 50 and y = 2\nPlease select the operator \n\t1.Add\n\t2.Subtract\n\t3.Multiply\n\t4.Divide\nEnter: ");
        int menu = input.nextInt(); 
        int x = 50;
        int y = 2;
        double ans;
        switch(menu) {
            case 1: ans = x + y; System.out.println("Answer is: " + ans); break;
            case 2: ans = x - y; System.out.println("Answer is: " + ans); break;
            case 3: ans = x * y; System.out.println("Answer is: " + ans); break;
            case 4: ans = x / y; System.out.println("Answer is: " + ans); break;
            default: System.out.println("You put invalid choice."); break;
        }
        input.close();
    }
}
