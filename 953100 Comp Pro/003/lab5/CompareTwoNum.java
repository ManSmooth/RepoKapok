import java.util.Scanner;
public class CompareTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result ;

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if(num1 > num2){
            result = "The first number is greater than the second";
        }
        else if(num1 < num2){
            result = "The first number is no greater than the second";
        }
        else {
            result = "These two numbers are equal";
        }

        System.out.print(result);


    }
    
}
