package Lab9_1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner w = new Scanner(System.in);
        Scanner s = new Scanner(new File(w.next()));
        w.close();
        double running_mean = 0;
        long total = 0;
        int mem = 0;
        while(s.hasNextInt()) {
            int next = s.nextInt();
            running_mean = ((mem * running_mean) + next)/++mem;
            total += next;

        }
        System.out.printf("Average: %.2f\n", running_mean);
        System.out.printf("Total: %d\n", total);
    }
}
