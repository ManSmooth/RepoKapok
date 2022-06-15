
//642115003 Kan Katpark
import java.util.Scanner;

public class MyHex2Deci {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hex number :");
        String hexNum = sc.next();

        do {
            try {
                hexNum = hexNum.toUpperCase() ;
                int hexValue = hex2Deci(hexNum);
                System.out.println(hexValue);
                break;
            } catch (NumberFormatException err) {
                System.out.println(err);
                System.out.print("Enter hex number :");
                hexNum = sc.next();
            }
        } while (true);

    }

    public static int hex2Deci(String hexNumber) throws NumberFormatException {
        int value = 0;
        int count = hexNumber.length() - 1;
        for (int i = 0; i < hexNumber.length(); i++) {
            char temp = hexNumber.charAt(i);
            int temp2 = (int) Math.pow(16, count);

            if (temp >= 'A' && temp <= 'F') {
                int temp3 = (int) (temp) - 'A' + 10;
                value += temp3 * temp2;

            } else if (temp >= '0' && temp <= '9') {
                int temp3 = (int) (temp) - '0';
                value += temp3 * temp2;
            } else {
                throw new NumberFormatException("Not a hex number");
            }

            count--;
        }
        return value;
    }

}
