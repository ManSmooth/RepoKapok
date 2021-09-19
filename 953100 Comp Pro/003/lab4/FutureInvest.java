import java.util.Scanner;
public class FutureInvest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        Double futureInvest;
        Double interestRate;


        //input
        System.out.print("Input the invest amount : ");
        Double investAmount = input.nextDouble();
        System.out.print("Input the interest rate : ");
        Double interest = input.nextDouble();
        System.out.print("Input years : ");
        int years = input.nextInt();


        //find future invest 
        interestRate = interest/100 ; 
        futureInvest = investAmount*Math.pow(1+ interestRate ,years);
        System.out.println( "The future investment value = "+ (int)(futureInvest*1000)/1000.0 );
    }
    
}
