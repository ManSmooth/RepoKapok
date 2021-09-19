import java.util.Scanner ;
public class ConverTemp {
    public static void main(String[] args) {
        String result  ;
        Scanner input = new Scanner(System.in);

        System.out.println("Please select mode type 0 for Celsius to Fahrenheit or type 1 for Fahrenheit to Celsius");

        int mode = input.nextInt();

        if( mode == 0 ){
            System.out.println("Celsius to Fahrenheit");
            System.out.print("Enter celsius :"); 
            double c = input.nextDouble() ;
        
            double f = (9*c)/5 +32 ;
            f = (int)(f*100)/100.0 ; 
            result = c + " Celsius is " + f +" Fahrenheit" ;

        }
        else if( mode == 1 ) {
            System.out.println("Fahrenheit to Celsius");
            System.out.print("Enter Fahrenheit :"); 
            double f = input.nextDouble() ;
        
            double c = (f-32)*5/9 ;
            c = (int)(c*100)/100.0 ;

            result = f + " Fahrenheit is " + c +" Celsius" ;
        }

        else {
            result ="Error";
        }

    System.out.println(result);        

    }
}
