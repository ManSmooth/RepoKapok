//642115003 Kan Katpark
import java.util.Random;

public class MyRandom {
    public static void main(String[] args) {
        int seed = 1000;
        Random ran = new Random();
        ran.setSeed(seed);

        for (int i = 0; i < 50; i++) {
            System.out.println(ran.nextInt(100));
        }

    }

}