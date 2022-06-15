package tutorial3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bubba {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        Scanner p = new Scanner(System.in);

        // GET NUM
        String in;
        System.out.printf("Enter the number: ");
        while ((in = p.nextLine()).length() != 0) {
            try {
                x.add(Integer.parseInt(in));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
            System.out.printf("Enter the number: ");
        }
        System.out.println(x);

        // SORTING
        for (int i = 0; i < x.size() - 1; i++) {
            for (int j = 0; j < x.size() - 1 - i; j++) {
                if (x.get(j) > x.get(j + 1)) {
                    Collections.swap(x, j, j + 1);
                }
            }
        }
        System.out.println(x);

        // CLOSING
        p.close();
    }
}