package Lab3;
import java.util.Scanner;
    //----------Lab 3 
    //----------Sarin 642115046
    //This program for calculating time
public class TimeCalc {
    public static void main(String[] args) {
        int sec;
        Scanner in = new Scanner(System.in);
        System.out.println("Input time in seconds: ");
        sec = in.nextInt();
        in.close();
        System.out.printf("The time is %d day(s) %02d:%02d:%02d",sec / 86400 ,sec / 3600 % 24, sec / 60 % 60, sec % 60);
    }
}
