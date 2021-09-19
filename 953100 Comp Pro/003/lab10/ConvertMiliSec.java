import java.util.Scanner;
public class ConvertMiliSec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in miliseconds: ");
        int milisec = input.nextInt();
    
        String output = getTime(milisec);
        System.out.print(output);
    }

    public static String getTime(int x){
        String result = "";
        int totalSecs = x/1000;
        int secsOut = (totalSecs%3600)%60 ;
        int minsOut = (totalSecs%3600)/60;
        int hoursOut = (totalSecs/3600) ;
        result = hoursOut+":"+minsOut+":"+secsOut;
        return result;
    }
}
