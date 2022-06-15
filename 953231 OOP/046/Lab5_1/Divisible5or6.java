package Lab5_1;

import java.math.BigInteger;

public class Divisible5or6 {
    public static void main(String[] args) {
        final int LENGTH = 10;
        BigInteger num = BigInteger.valueOf(Long.MAX_VALUE);
        int mod1 = num.mod(BigInteger.valueOf(5)).intValue();
        int mod2 = num.mod(BigInteger.valueOf(6)).intValue();
        int runner = 0;
        for (int i = 0; i < (5 * 6); i++) {
            if(i % 5 == mod1 && i % 6 == mod2) {
                runner = i;
            }
        }
        int offset = 0;
        for (int i = 0; i < LENGTH; i++) {
            while(runner % 5 != 0 && runner % 6 != 0) {
                runner++;
                offset++;
                continue;
            }
            System.out.println(num.add(BigInteger.valueOf(offset)));
            runner++;
            offset++;
        }
    }
}
