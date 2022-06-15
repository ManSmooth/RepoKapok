package Lab8_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OOB {
    public static void main(String[] args) {
        int[] n = new int[100];
        for (int i = 0; i < n.length; i++) {
            n[i] = ThreadLocalRandom.current().nextInt(0, 100);
        }
        Scanner s = new Scanner(System.in);
        try {
            System.out.println(n[s.nextInt()]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
        finally {
            s.close();
        }
    }
}
