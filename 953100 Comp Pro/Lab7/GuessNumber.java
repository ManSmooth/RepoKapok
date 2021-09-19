package Lab7;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = -2;
        while (guess != number && guess != -1) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            if (guess != -1) {
                if (guess == number) System.out.println("Yes, the number is " + number);
                else if (guess > number) System.out.println("Your guess is too high");
                else System.out.println("Your guess is too low");
            }
        }
        if (guess == -1) {
            System.out.println("The number is " + number);
        }
        input.close();
      }
    }
