package Lab3_1;

import java.util.Random;

public class lab_random {
    public static void main(String[] args) {
        Random r = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.printf("%d\t", r.nextInt(100));
        }
    }
}
