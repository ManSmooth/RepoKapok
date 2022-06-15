package Lab11_2;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Date> dateList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dateList.add(new Date(ThreadLocalRandom.current().nextLong(31536000000l)));
        }
        System.out.println(dateList);
        System.out.println(dateList.stream().map(x -> x.getTime()).toList());
        System.out.println("\nMIN");
        System.out.println(min(dateList).getTime());
        System.out.println(min(dateList));
        System.out.println("\nSORT");
        sort(dateList);
        System.out.println(dateList);
        System.out.println(dateList.stream().map(x -> x.getTime()).toList());
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) == 1) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        int mindex;
        for (int i = 0; i < list.size(); i++) {
            mindex = i;
            for (int j = i; j < list.size(); j++) if (list.get(mindex).compareTo(list.get(j)) == 1) mindex = j;
            Collections.swap(list, mindex, i);
        }
    }
}
