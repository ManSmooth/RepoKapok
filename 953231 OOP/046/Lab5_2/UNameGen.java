package Lab5_2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class UNameGen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First name: ");
        String FName = in.nextLine();
        System.out.print("Last Name: ");
        String LName = in.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(FName.charAt(0));
        sb.append(LName.substring(0, 5));
        sb.append(ThreadLocalRandom.current().nextInt(10, 100));
        System.out.printf("Username: %s", sb.toString());
        in.close();
    }
}
