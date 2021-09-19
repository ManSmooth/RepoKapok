import java.util.Scanner;
public class Hw642115003{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tax = 0.0 ;
        String statusName = "";

        System.out.println("Enter your status Single(0) Married Filling Jointly or Qualifying Widow(er) (1) Married Filling Separately(2) Head of Household(3)");
        System.out.print("Your status: ");
        int status = input.nextInt();

        System.out.print("Input your income:");
        int income = input.nextInt();
        int tempIncome = income ;


        if(income < 0 || status > 3 || status < 0){
            System.out.println("Error: Please Enter status or income correctly");
        } else {
            if( status == 0){
                statusName = "Single" ;
                if(income <= 8350){
                    tax = income * 0.1 ;
                }
                else if(income <= 33950){
                    tax = (income - 8350)*0.15 + (8350*0.1) ;
                }
                else if(income <= 82250){
                    tax = (income - 8350 - 33950 )*0.25 + (33950*0.15) + (8350*0.1) ;
                }
                else if(income <= 171550){
                    tax = (income - 8350 - 33950 - 82250)*0.28 + (82250*0.25) +(33950*0.15) + (8350*0.1) ;
                }
                else if(income <= 372950){
                    tax = (income - 8350 - 33950 - 82250 -171550)*0.33 + (171550 *0.28) + (82250*0.25) +(33950*0.15) + (8350*0.1) ;
                }
                else if(income >= 372951){
                    tax = (income - 8350 - 33950 - 82250 -171550 - 372950)*0.35 + (372950 *0.33) + (171550 *0.28) + (82250*0.25) +(33950*0.15) + (8350*0.1) ;
                }
                else {
                    System.out.println("Error") ;
                }
            } else if(status == 1){
                statusName = "Married Filling Jointly or Qualifying Widow(er)" ;
                if(income <= 16700){
                    tax = income * 0.1 ;
                }
                else if(income <= 67900){
                    tax = (income - 16700)*0.15 + (16700*0.1) ;
                }
                else if(income <= 137050){
                    tax = (income - 16700 - 67900 )*0.25 + (67900*0.15) + (16700*0.1) ;
                }
                else if(income <= 208850){
                    tax = (income - 16700 - 67900 -137050)*0.28 + (137050*0.25) +(67900*0.15) + (16700*0.1) ;
                }
                else if(income <= 372950){
                    tax = (income - 16700 - 67900 -137050 -208850)*0.33 + (208850 *0.28) + (137050*0.25) +(67900*0.15) + (16700*0.1) ;
                }
                else if(income >= 372951){
                    tax = (income - 16700 - 67900 -137050 -208850 -372950)*0.35 +(372950*0.33)+(208850 *0.28) + (137050*0.25) +(67900*0.15) + (16700*0.1) ;
                }
                else {
                    System.out.println("Error") ;
                }

            } else if(status == 2){
                statusName = "Married Filling Separately" ;
                if(income <= 8350){
                    tax = income * 0.1 ;
                }
                else if(income <= 33950){
                    tax = (income - 8350)*0.15 + (8350*0.1) ;
                }
                else if(income <= 68525){
                    tax = (income - 33950 - 8350 )*0.25 + (33950*0.15) + (8350*0.1) ;
                }
                else if(income <= 104425){
                    tax = (income - 68525 - 33950 -8350)*0.28 + (68525*0.25) +(33950*0.15) + (8350*0.1) ;
                }
                else if(income <= 186475){
                    tax = (income - 104425 - 68525 - 33950 -8350)*0.33 + (104425 *0.28) + (68525*0.25) +(33950*0.15) + (8350*0.1) ;
                }
                else if(income >= 186476){
                    tax = (income - 186475 - 104425 - 68525 - 33950 -8350)*0.35 +(186475*0.33)+(104425 *0.28) + (68525*0.25) +(33950*0.15) + (8350*0.1) ;
                }
                else {
                    System.out.println("Error") ;
                }    

            } else if(status == 3){
                statusName = "Head of Household" ;
                if(income <= 11950){
                    tax = income * 0.1 ;
                }
                else if(income <= 45500){
                    tax = (income - 11950)*0.15 + (11950*0.1) ;
                }
                else if(income <= 117450){
                    tax = (income - 45500 - 11950 )*0.25 + (45500*0.15) + (11950*0.1) ;
                }
                else if(income <= 190200){
                    tax = (income - 117450 - 45500 -11950)*0.28 + (117450*0.25) +(45500*0.15) + (11950*0.1) ;
                }
                else if(income <= 372950){
                    tax = (income - 190200 - 117450 - 45500 -11950)*0.33 + (190200 *0.28) + (117450*0.25) +(45500*0.15) + (11950*0.1) ;
                }
                else if(income >= 372951){
                    tax = (income - 372950 - 190200 - 117450 - 45500 -11950)*0.35 +(372950*0.33)+(190200 *0.28) + (117450*0.25) +(45500*0.15) + (11950*0.1) ;
                }
                else {
                    System.out.println("Error") ;
                } 
            }else {
                System.out.println("Error") ;
            }   
         System.out.println("For "+statusName +" and income is $"+ tempIncome + " tax will be $"+ (int)(tax*10)/10.0 +" ");
        }  
    }
}