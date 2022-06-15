package Lab2_2;

import java.io.*;

public class Counter_test {
    public static void main(String[] args) {
        Counter count_a = new Counter();
        Counter count_e = new Counter();
        try (BufferedReader br = new BufferedReader(new FileReader(new File("cake-recipe.txt")))) {
            int in;
            while((in = br.read()) != -1) {
                if(in == 'a' || in == 'A') {
                    count_a.click();
                }
                if(in == 'e' || in == 'E') {
                    count_e.click();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Count of A: %d\n", count_a.getCount());
        System.out.printf("Count of E: %d\n", count_e.getCount());
        count_a.reset();
        count_e.reset();
        System.out.println(count_a.getCount() == 0);
        System.out.println(count_e.getCount() == 0);
    }
}
