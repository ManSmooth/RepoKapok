import java.util.Scanner;
public class ComputeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money ;

        System.out.print("Input work hours :");
        int workHour = input.nextInt();

        if(workHour <= 40){
            money = workHour*8;
        }
        else{
            money = 320 + ( workHour -40 )*12 ;
        }
        
        System.out.println("You will get " + money +" $") ;

    }
}
