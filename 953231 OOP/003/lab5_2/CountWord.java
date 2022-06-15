//642115003 Kan Katpark
import java.util.Scanner;
public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text :");
        String text = sc.nextLine();
        System.out.println(count(text));
       
    }

    public static int count(String text){
        String token[] = text.split(" ");
        return token.length;
    }
}
