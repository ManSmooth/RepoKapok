package Lab9;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numbers = in.next();
        in.close();
        numShow(numbers);
    }
    public static void numShow(String p) {
        for(int i = 0; i < p.length(); i++){
            switch(p.charAt(i)) {
                case '0':
                    System.out.println("000000\n00  00\n00  00\n00  00\n000000\n");
                    break;
                case '1':
                    System.out.println("  1111\n    11\n    11\n    11\n    11\n");
                    break;
                case '2':
                    System.out.println("222222\n    22\n222222\n22    \n222222\n");
                    break; 
                case '3':
                    System.out.println("333333\n    33\n333333\n    33\n333333\n");
                    break;
                case '4':
                    System.out.println("44  44\n44  44\n444444\n    44\n    44\n");
                    break;
                case '5':
                    System.out.println("555555\n55    \n555555\n    55\n555555\n");
                    break;
                case '6':
                    System.out.println("666666\n66    \n666666\n66  66\n666666\n");
                    break;
                case '7':
                    System.out.println("777777\n    77\n    77\n    77\n    77\n");
                    break;
                case '8':
                    System.out.println("888888\n88  88\n888888\n88  88\n888888\n");
                    break;
                case '9':
                    System.out.println("999999\n99  99\n999999\n    99\n999999\n");
                    break;
                default:
                    break;
            }
        }
    }
}
