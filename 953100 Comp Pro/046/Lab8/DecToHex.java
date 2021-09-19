package Lab8;

import java.util.Scanner;

public class DecToHex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        in.close();
        String result = "";
        int digits = (int) Math.ceil(Math.log(n)/Math.log(16));
        for(int i = 0; i < digits; i++) {
            int temp = (int) ((n / Math.pow(16, (digits - (i+1))))) % 16;
            result += (char)(temp > 9?('a' + temp - 10):('0' + temp));
        }
        System.out.println(result);
    }
}
