package Lab7;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        in.close();
        int i = 0;
        int q = 0;
        while(i < n){
            i++;
            if(i%7 == 0 ^ i%5 == 0){
                System.out.printf("%d ", i);
                q++;
            }
            if(q%10 == 0 && q != 0){
                System.out.printf("\n");
                q = 0;
            }
        }
    }
}
