//642115003 Kan Katpark
import java.math.*;

public class FindTenDeci {
    public static void main(String[] args) {
        bigInt();
    }

    public static void bigInt() {
        BigInteger num = new BigInteger("100000000000000000000000000000000000000000000000000");
        int count = 0;

        while (count != 10) {
            num = num.add(BigInteger.ONE);
            BigInteger[] res = num.divideAndRemainder(new BigInteger("2"));
            BigInteger[] res2 = num.divideAndRemainder(new BigInteger("3"));

            if (res[1].equals(new BigInteger("0"))) {
                count++;
                System.out.println(num);
            } else if (res2[1].equals(new BigInteger("0"))) {
                count++;
                System.out.println(num);
            }
        }
    }

}