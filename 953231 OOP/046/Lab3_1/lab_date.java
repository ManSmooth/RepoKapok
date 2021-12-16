package Lab3_1;

import java.util.Date;

public class lab_date {
    public static void main(String[] args) {
        Date date = new Date(1000);
        for (int i = 0; i < 8; i++) {
            date.setTime(date.getTime() * 10);
            System.out.println(date);
        }
    }
}
