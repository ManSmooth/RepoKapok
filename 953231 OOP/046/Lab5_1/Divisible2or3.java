package Lab5_1;

import java.math.BigInteger;

public class Divisible2or3 {
    public static void main(String[] args) {
        final int LENGTH = 10;
        final BigInteger FIFTY_DIGITS = new BigInteger("1" + "0".repeat(49));
        int mod2 = FIFTY_DIGITS.mod(BigInteger.valueOf(2)).intValue();
        int mod3 = FIFTY_DIGITS.mod(BigInteger.valueOf(3)).intValue();
        int runner = 0;
        for (int i = 0; i < 6; i++) {
            if(i % 2 == mod2 && i % 3 == mod3) {
                runner = i;
            }
        }
        int offset = 0;
        for (int i = 0; i < LENGTH; i++) {
            while(runner % 2 != 0 && runner % 3 != 0) {
                runner++;
                offset++;
                continue;
            }
            System.out.println(FIFTY_DIGITS.add(BigInteger.valueOf(offset)));
            runner++;
            offset++;
        }
    }
}
