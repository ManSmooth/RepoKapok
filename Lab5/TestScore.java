package Lab5_1;

import java.util.Scanner;

public class  TestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Score: "); 
        int score = input.nextInt();
        input.close();
        if (score >= 80) System.out.println("You passed.");
        else System.out.println("You failed.");
    }
}
