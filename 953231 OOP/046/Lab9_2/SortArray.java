package Lab9_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class SortArray {
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int mindex = i;
            for (int j = i; j < list.size(); j++) {
                mindex = list.get(mindex).doubleValue() > list.get(j).doubleValue() ? j : mindex;
            }
            Collections.swap(list, i, mindex);
        }
    }

    public static void main(String[] args) {
        ArrayList<Number> n = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            n.add(ThreadLocalRandom.current().nextDouble() * 100);
        }
        System.out.println(n);
        sort(n);
        System.out.println(n);
    }
}
