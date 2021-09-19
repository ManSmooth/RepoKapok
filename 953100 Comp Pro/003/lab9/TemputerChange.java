import java.util.Scanner ;
public class TemputerChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert Celsuis to Fahrenheit (c) Convert Fahrenheit to Celsuis (f) or Cancel (x) "); 
        char text = input.next().charAt(0);
        double num ;
        
        while(text !='x' && text !='X'){
            if(text =='C' || text == 'c'){
                System.out.print("Enter temputure (C): ");
                num = input.nextDouble();
                celsuisToFahren(num);
            }
            else if(text =='F' || text == 'f'){
                System.out.print("Enter temputure (F): ");
                num = input.nextDouble();
                fahrentoCelsuis(num);

            }
            else{
                System.out.println("ERROR");
                break;
                
            }
            
            System.out.println("Convert Celsuis to Fahrenheit (c) Convert Fahrenheit to Celsuis (f) or Cancel (x) ");
            text = input.next().charAt(0);

        }
    }

    public static void celsuisToFahren(double c){
        double result ;
        result = ((9*c)/5) +32;
        System.out.println(c + " C = " +result + " F ");
    }

    public static void fahrentoCelsuis(double f){
        double result ;
        result = (f -32)*5/9;
        System.out.println(f + " F  = " + result + " C ");
    }

}
