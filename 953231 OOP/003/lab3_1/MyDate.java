//642115003 Kan Katpark
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        long time = 10000;
        int count = 1;

        Date date = new Date();

        while (count <= 8) {
            // System.out.println(time);
            date.setTime(time);
            System.out.println(date.toString());

            time *= 10;
            count++;
        }
    }

}
