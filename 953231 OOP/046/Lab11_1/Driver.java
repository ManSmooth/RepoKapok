package Lab11_1;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Driver {
    public static void main(String[] args) {
        GenericStack<String> gs = new GenericStack<>();
        gs.push("1");
        gs.push("2");
        gs.push("3");
        gs.push("4");
        gs.push("5");
        gs.push("6");
        System.out.println(gs);
        System.out.println(gs.pop());
        System.out.println(gs.pop());
        System.out.println(gs);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        shuffle(al);
        System.out.println(al);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            //Collections.swap(list, i, ThreadLocalRandom.current().nextInt(list.size()));
            int rand = ThreadLocalRandom.current().nextInt(list.size());
            E targetA = list.get(i);
            E targetB = list.get(rand);
            list.set(i, targetB);
            list.set(rand, targetA);
        }
    }
}
