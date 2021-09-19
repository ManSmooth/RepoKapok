package Lab10;

import java.util.Scanner;

public class timeConv {
    public static String convertMillis(long in) {
        return String.format("%d:%d:%d", in / 3600000, in / 6000 % 60, in / 1000 % 60);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long mil = in.nextLong();
        in.close();
        System.out.println(convertMillis(mil));
    }
}
