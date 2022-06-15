package Lab5_2;

import java.util.*;

public class toUpper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("String in: ");
        System.out.printf("out: %s", in.nextLine().toUpperCase());
        in.close();
    }
}
