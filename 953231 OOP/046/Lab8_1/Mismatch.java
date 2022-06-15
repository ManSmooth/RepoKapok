package Lab8_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch {
    static Scanner s;
    public static void main(String[] args) {
        s = new Scanner(System.in);
        int x = promptInt();
        int y = promptInt();
        s.close();
        System.out.println(x + y);
    }

    public static int promptInt() {
        int temp = 0;
        try {
            System.out.print("Input number: ");
            temp = s.nextInt();
        }
        catch(InputMismatchException e) {
            s.next();
            temp = promptInt();
        }
        return temp;
    }
}

