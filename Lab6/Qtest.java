package Lab6;
import java.util.Scanner;

public class Qtest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees: "); 
        double deg = input.nextDouble(); 
        input.close();
        if(deg % 90 != 0) {
            switch((int)deg / 90 % 4) {
                case 0:
                System.out.println("Q. I");
                break;
                case 1:
                System.out.println("Q. II");
                break;
                case 2:
                System.out.println("Q. III");
                break;
                case 3:
                System.out.println("Q. IV");
                break;
            }
        }
        else {
            System.out.println("On axis");
        }
    }
}
