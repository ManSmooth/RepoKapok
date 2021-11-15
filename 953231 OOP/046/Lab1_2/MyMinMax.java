package Lab1_2;

import java.util.Scanner;

public class MyMinMax {
    public static void main(String[] args) {
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        answer = MyMax(scan.nextInt(), scan.nextInt());
        System.out.println("Your max is: " + answer);
        System.out.print("Enter 2 numbers: ");
        answer = MyMin(scan.nextInt(), scan.nextInt());
        System.out.println("Your min is: " + answer);
        scan.close();
    }

    static int MyMax(int x, int y) {
        return x > y ? x : y;
    }

    static int MyMin(int x, int y) {
        return x > y ? y : x;
    }
}
