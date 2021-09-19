import java.util.Scanner;
public class TestMax{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int num1 = input.nextInt();
        System.out.print("Input number 2: ");
        int num2 = input.nextInt();
        System.out.print("Input number 3: ");
        int num3 = input.nextInt();
        System.out.print("Input number 4: ");
        int num4 = input.nextInt();

        System.out.print("Max number of the " + num1+" " + num2+" "+ num3+" "+ num4+" is " + findMax(num1 , num2 ,num3 , num4));
    }

    public static int findMax(int a , int b , int c , int d){
        int maxNum;
        if(a > b && a>c && a> d){
            maxNum = a;
        }
        else if( b > a && b > c && b>d){
            maxNum= b;
        }
        else if(c >a && c > b && c>d){
            maxNum = c;
        }
        else {
            maxNum = d; 
        }

        return maxNum;
    }
}