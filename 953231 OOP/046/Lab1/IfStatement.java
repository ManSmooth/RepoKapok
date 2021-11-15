package Lab1;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        p.close();
        if (n < 500) {
            System.out.println("Your value is too low.");
        } else {
            System.out.println("Your value is high enough.");
        }
    }
}