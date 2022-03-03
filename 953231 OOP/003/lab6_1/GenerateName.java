//642115003 Kan Katpark

import java.util.Scanner;
import java.util.Random;
public class GenerateName {
    public static void main(String[] args) {
        String name ;
        Scanner in = new Scanner(System.in) ;

        System.out.print("Enter Full name : ");
        name = in.nextLine() ;

        String username = createName(name);
        System.out.println(username);
    }

    public static String createName(String name){
        Random random = new Random();

        String[] temp = name.split(" ");
        String returnString = temp[0].charAt(0) + "" + temp[1].substring(0,5) ;
        int number = random.nextInt(89)+ 10 ;
        return returnString + "" + number ;
        

    }
}