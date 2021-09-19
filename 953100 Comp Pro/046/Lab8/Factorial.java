package Lab8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        in.close();
        int t = 1;
        for(int i = 0; i < n; i++) t *= (i+1);
        System.out.println(t);
    }
}
