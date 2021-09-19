import java.util.Scanner;
public class TimeCalculator {
    public static void main(String[] args) {
        // final double DAY = 86400;
        // final double HOUR = 3600 ;
        // final double MIN = 60;
        int totalSeconds ;

        Scanner input = new Scanner(System.in);
        System.out.print("Input the seconds: ");
        totalSeconds = input.nextInt();

        // double daysOut = totalSeconds/DAY;
        // daysOut = Math.floor(daysOut);

        // double hoursOut = (totalSeconds - (daysOut*DAY))/HOUR;
        // hoursOut = Math.floor(hoursOut);

        // double minutesOut = ((totalSeconds - (daysOut*DAY)) - ( hoursOut *HOUR ))/MIN;
        // minutesOut = Math.floor(minutesOut);

        // double secondsOut = (totalSeconds - (daysOut*DAY)) - ( hoursOut *HOUR ) - (minutesOut*MIN)  ;
        // secondsOut = Math.floor(secondsOut);

        //easier way ---------------------------------------------

        int daysOut = totalSeconds / 86400 ;
        int hoursOut = (totalSeconds%86400)/3600 ;
        int minutesOut = ((totalSeconds%86400)%3600)/60 ;
        int secondsOut = ((totalSeconds%86400)%3600)%60 ;

        System.out.println("Days: "+ daysOut +" days Hours: "+hoursOut+" hrs Minutes: "+ minutesOut +" mins Seconds: " +secondsOut +" secs"  );
        
    }
}