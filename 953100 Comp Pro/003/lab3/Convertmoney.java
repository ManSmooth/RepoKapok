import java.util.Scanner;
public class Convertmoney {
    public static void main(String[] args) {
        double thaiMoney;
        double dollar;
        final double RATE = 31.8245 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Input US dollar: ");
        dollar = input.nextDouble();

        thaiMoney = dollar * RATE;
        System.out.print("Thai Baht is "+thaiMoney +" Bahts");

    }    
}
