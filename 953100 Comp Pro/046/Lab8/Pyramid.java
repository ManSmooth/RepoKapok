package Lab8;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        in.close();
        for(int i = 1; i <= n; i++) {
            System.out.print("\t".repeat(n-i));
            for(int j = 0; j < (2*i)-1; j++) {
                System.out.printf("%8.0f", Math.floor(Math.pow(2,((2*i) / 2) - 1 - Math.abs((j+1) - ((2*i) / 2)))));
            }
            System.out.println("");
        }
    }
}
