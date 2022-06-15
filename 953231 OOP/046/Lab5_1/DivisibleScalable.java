package Lab5_1;

import java.math.BigInteger;

public class DivisibleScalable {
    public static void main(String[] args) {
        final int LENGTH = 10;
        final int[] divisor = {5, 6};
        BigInteger num = BigInteger.valueOf(Long.MAX_VALUE);
        int[] mod = new int [divisor.length];
        for (int i = 0; i < divisor.length; i++) {
            mod[i] = num.mod(BigInteger.valueOf(divisor[i])).intValue();
        }
        int runner = 0;
        for (int i = 0; i < lcmofarray(divisor, 0, divisor.length); i++) {
            boolean flag = true;
            for (int j = 0; j < divisor.length; j++) {
                if(i % divisor[j] != mod[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                runner = i;
            }
        }
        System.out.println(runner);
        int offset = 0;
        for (int i = 0; i < LENGTH; i++) {
            boolean flag = true;
            while(flag) {
                flag = true;
                for (int j = 0; j < divisor.length; j++) {
                    if(runner % divisor[j] == 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    runner++;
                    offset++;
                }
            }
            System.out.println(num.add(BigInteger.valueOf(offset)));
            runner++;
            offset++;
        }
    }

    //StackOverflow Code: https://stackoverflow.com/questions/17689529/lcm-of-all-the-numbers-in-an-array-in-java/48426659
    public static int lcm(int a, int b){
        return ((a*b)/gcd(a,b));
    } 

    public static int gcd(int a, int b){
        if (a<b) return gcd(b,a);
        if (a%b==0) return b;
        else return gcd(b, a%b);
    }

    public static int lcmofarray(int[] arr, int start, int end){
        if ((end-start)==1) return lcm(arr[start],arr[end-1]);
        else return (lcm (arr[start], lcmofarray(arr, start+1, end)));
    }
}
