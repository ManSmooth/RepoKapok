import java.util.*;
import java.nio.charset.*;

public class UnlockMyLimit{
    public static void main(String[] args) {
        System.setProperty("encoding", "UTF-8");
        
        String test = "หล่อเท่";
        System.out.println("Encoding :" + Charset.defaultCharset());

        Scanner in = new Scanner(System.in , "TIS620");
        System.out.print("Enter anything: ");
        String text = in.nextLine();
        System.out.println(text +" "+test);
        // javac -encoding UTF-8 UnlockMyLimit.java
        for(int i = text.length()-1 ; i >= 0 ;i--){
            System.out.print((int)text.charAt(i) + " ");
        }
    }
}
