package tutorial3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class selection {
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
        int mindex;
        for (int i = 0; i < x.size(); i++) {
            mindex = i;
            for (int j = i; j < x.size(); j++) {
                if (x.get(mindex) > x.get(j)) {
                    mindex = j;
                }
            }
            Collections.swap(x, mindex, i);
        }
        System.out.println(x);

        // CLOSING
        p.close();
    }
}