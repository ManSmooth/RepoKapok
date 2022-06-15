//642115003 Kan Katpark
import java.util.Random;

public class MyMath {
    public static void main(String[] args) {
        Random ran = new Random();
        
        int radius = ran.nextInt(20) +20 ;

        System.out.println("Sine(" + radius + ") : " + Math.sin(radius));
        System.out.println("Cosine (" + radius + ") : " + Math.cos(radius));
        System.out.println("Tangent(" + radius + ") : " + Math.tan(radius));

    }
}
