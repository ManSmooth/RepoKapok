package Lab9_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        //Write
        FileWriter fw = null;
        try {
            fw = new FileWriter("Lab9_1/Lab20_02.txt", false);
            for (int i = 0; i < 100; i++) {
                fw.append(String.format("%d ", ThreadLocalRandom.current().nextInt(0, 101)));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fw.close();
        }
        //Read
        Scanner s = new Scanner(new File("Lab9_1/Lab20_02.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        while(s.hasNextInt()) {
            list.add(s.nextInt());
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
