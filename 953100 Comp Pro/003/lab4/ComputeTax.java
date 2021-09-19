import java.util.Scanner;
public class ComputeTax {
    public static void main(String[] args) {
        Double grossPay;
        Double federal;
        Double state;
        Double totalDeduction;
        Double netPay ;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ") ;
        String name = input.next();
        System.out.print("Enter hours of work: ") ;
        Double hours = input.nextDouble();
        System.out.print("Enter pay rate: ") ;
        Double rate = input.nextDouble();
        System.out.print("Federal Tax withholding rate(%): ") ;
        Double federalRate = input.nextDouble();
        System.out.print("State tax withholding rate(%): ") ;
        double stateRate = input.nextDouble();


        //calculate gross pay
        grossPay = rate*hours;
        federal = grossPay*federalRate/100.0;
        state = grossPay*stateRate/100.0;
        totalDeduction = state+federal;
        netPay = grossPay-totalDeduction;

        //output
        System.out.println("Employee's name: " + name) ;
        System.out.println("Hours of work: " +hours +" hrs") ;
        System.out.println("Pay rate: " + rate) ;
        System.out.println("Gross pay: " +grossPay);
        System.out.println("Deductions:");
        System.out.println("    Federal withholding(" + (int)(federalRate*10)/10+ "%): " +(int)(federal*100)/100.0 );
        System.out.println("    State withholding(" + (int)(stateRate*10)/10 + "%): " +(int)(state*100)/100.0 );
        System.out.println("    Total Deduction: " + (int)(totalDeduction*100)/100.0 );
        System.out.println("Net pay for " + name+ ": " + (int)(netPay*100)/100.0 ) ;
    }
    
}
