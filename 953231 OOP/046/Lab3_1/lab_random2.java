package Lab3_1;

import java.util.Random;

public class lab_random2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt((20) + 1) + 20;
        System.out.printf("Number: %d\nSine: %f\nCosine: %f\nTangent: %f", num, Math.sin(num), Math.cos(num),
                Math.tan(num));
    }
}
