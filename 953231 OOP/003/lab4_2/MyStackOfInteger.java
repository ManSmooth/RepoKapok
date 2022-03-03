//642115003 Kan Katpark

import java.util.Scanner;

public class MyStackOfInteger {
    public static void main(String[] args) throws Exception {

        StackOfInteger stack = new StackOfInteger(100);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter some Number: ");
        int x = in.nextInt();

        while (x != 1) {
            for (int i = 2; i <= x; i++) {
                if(isPrime(i) && x % i == 0) {
                    // System.out.println(i);
                    stack.push(i);
                    x = x / i;
                    break;
                }
            }
        }

        while (stack.count() > 0) {
            System.out.print(stack.pop() + " ");
        }

    }

    public static boolean isPrime(int x){
        for(int i = 2 ;i <= x/2 ; i++){
            if(x%i == 0) return false;
        }
        return true;
    }
}
