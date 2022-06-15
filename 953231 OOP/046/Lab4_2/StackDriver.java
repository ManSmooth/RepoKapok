package Lab4_2;

import java.util.Scanner;

public class StackDriver {
    public static void main(String[] args) {    
        StackofInteger s = new StackofInteger();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cap = n / 2;
        for (int i = 2; i < cap; i++) {
            while(n % i == 0) {
                s.push(i);
                n /= i;
            }
            if(n == 1) {
                break;
            }
        }
        while(!s.empty()) {
            System.out.printf("%d ", s.pop());
        }
        in.close();
    }
}