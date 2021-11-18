// 642115003 Kan Katpark
import java.util.Scanner;
public class IfStatement {
    public static void main( String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int x = input.nextInt();

        if(x < 500){
            System.out.println("Your value is too low.");
        }else{
            System.out.println("Your value is high enough");
        }

    }
}