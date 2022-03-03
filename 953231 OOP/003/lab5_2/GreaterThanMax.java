//642115003 Kan Katpark
import java.math.* ;
public class GreaterThanMax {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(Long.MAX_VALUE + "") ;

        int count = 0 ;
        while(count != 10) {
            num = num.add(BigInteger.ONE);
            BigInteger[] res = num.divideAndRemainder(new BigInteger("5")) ;
            BigInteger[] res2 = num.divideAndRemainder(new BigInteger("6")) ;

                if(res[1].equals(new BigInteger("0"))){
                        count++;
                        System.out.println(num);
                }else if(res2[1].equals(new BigInteger("0"))){
                    count++;
                    System.out.println(num);
                }
        }
        

    }
}
