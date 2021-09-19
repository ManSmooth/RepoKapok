import java.util.Scanner ;
public class SortNumber {
    public static void main(String[] args) {
        String result = "" ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter Number 1 :");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2 :");
        int num2 = input.nextInt();
        System.out.print("Enter Number 3 :");
        int num3 = input.nextInt();        

        if( num1 >= num2 ){
            if(num2 >= num3){
                result = num3 + " " + num2 + " " + num1 ;
            }
            else {
                if(num3 >= num1){
                    result = num2 +" " + num1 +" " + num3 ;
                }
                else{
                    result = num2 + " " + num3 +" " + num1;
                }
            }
        
        }
        else if( num2 >= num1){
            if(num1 >= num3){
                result = num3 + " " + num1 + " " + num2;
            }
            else {
                if(num3 >= num2){
                    result = num1 + " "+num2 +" " + num3;
                }
                else {
                    result = num1+" "+num3 + " "+ num2;
                }
            }
        }
        else {
            result = "Error " ;
        }


        System.out.print(result);
    }
}