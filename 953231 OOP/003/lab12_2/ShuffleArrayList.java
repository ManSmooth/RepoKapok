//642115003 Kan Katpark

import java.util.ArrayList;
import java.util.Random;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Grape");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list);

        shuffle(list);
        System.out.println(list);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Random ran = new Random();

        for (int i = 0; i < list.size(); i++) {
            int j = ran.nextInt(list.size());

            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

        }
    }
}
