import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input num1 :");
        int x = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Input num2 :");
        int y = input2.nextInt();

        System.out.println("Max number is " + myMax(x, y));
        System.out.println("Min number is " + myMin(x, y));
    }

    public static int myMax(int x, int y){
        if(x > y) return x;
        return y;
    }
    public static int myMin(int x, int y){
        if(x < y) return x;
        return y;
    }
}
