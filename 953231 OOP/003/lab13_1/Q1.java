//642115003 Kan Katpark

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>() ;
        list.add(11.5);
        list.add(1.123);
        list.add(5.55);
        // list.add(-5.55);

        System.out.println(min(list));

        ArrayList<String> list2 = new ArrayList<>() ;
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Carrot");
        
        System.out.println(min(list2));
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(index)) != 1) {
                index = i;
            }

        }

        return list.get(index);

    }
}