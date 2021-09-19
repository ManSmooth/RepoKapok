import java.util.Scanner;
public class DeciToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = input.nextInt();
        int hexValue;
        char hexDigit;
        String hexlist = "";

        while(num != 0){
            hexValue = num % 16;

            if(hexValue >= 0 && hexValue <= 9){
                hexDigit = (char)( hexValue + 48 ); //char(48) = '0'
            }
            else {
                hexDigit = (char)((hexValue-10) + 65); //char(65) = 'A'
            }

            hexlist = hexDigit + hexlist ;
            num /=16;
        }
        System.out.print("Hexadecimal number: "+hexlist );      
    }
}