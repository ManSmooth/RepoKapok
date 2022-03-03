//642115003 Kan Katpark

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean loop = true ;
        int a, b, c;

        do {
            try {
                System.out.print("Enter A :");
                a = in.nextInt();

                System.out.print("Enter B :");
                b = in.nextInt();

                c = a + b;
                System.out.println("Summation: " + c);
                loop = false ;
            } catch (InputMismatchException err) {
                System.out.print(err);
                System.out.println(" Please check the input again.");
                in.nextLine();
            }
        } while (loop);

    }
}