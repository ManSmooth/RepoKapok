package Lab1;

import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        boolean quit = false;
        Scanner p = new Scanner(System.in);
        while (!quit) {
            System.out.println("Welcome to OOP Lab\n1. menu 1\n2. menu 2\n3. menu 3\n4. menu 4\n5. Bye Bye");
            int in = p.nextInt();
            if (in == 1) {
                System.out.println("\nWelcome to menu 1.\n");
            } else if (in == 2) {
                System.out.println("\nWelcome to menu 2.\n");
            } else if (in == 3) {
                System.out.println("\nWelcome to menu 3.\n");
            } else if (in == 4) {
                System.out.println("\nWelcome to menu 4.\n");
            } else if (in == 5) {
                System.out.println("\nBye bye, see you tomorrow.\n");
                quit = true;
            } else {
                System.out.println("\nInvalid Input.\n");
            }
        }
        p.close();
    }
}
