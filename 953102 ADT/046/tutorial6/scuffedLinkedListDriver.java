package tutorial6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class scuffedLinkedListDriver {
    public static void main(String[] args) {
        scuffedLinkedList<Applicant> list = new scuffedLinkedList<>();
        list.insert(new Applicant(1, "a", "b", new String[]{"a"}));
        list.insert(new Applicant(2, "c", "d", new String[]{"b"}));
        list.insert(new Applicant(3, "e", "f", new String[]{"c"}));
        list.insert(new Applicant(4, "g", "h", new String[]{"d"}));
        list.insert(new Applicant(5, "i", "j", new String[]{"e"}));
        list.insert(new Applicant(6, "k", "l", new String[]{"f"}));
        list.insert(new Applicant(7, "m", "n", new String[]{"g"}));
        list.insert(new Applicant(8, "o", "p", new String[]{"h"}));
        list.insert(new Applicant(9, "q", "r", new String[]{"i"}));
        list.insert(new Applicant(10, "s", "t", new String[]{"j"}));
        list.delete(ThreadLocalRandom.current().nextInt(0, list.getSize()));
        list.delete(ThreadLocalRandom.current().nextInt(0, list.getSize()));
        System.out.println("After 2 deletes");
        list.printList();
        list.deleteAll();
        System.out.println("After deleteAll");
        list.printList();
        System.out.print("Is Empty? ");
        System.out.println(list.isEmpty());
    }
}

class Applicant {
    int SID;
    String firstName, lastName;
    ArrayList<String> vaccines = new ArrayList<>();

    Applicant(int SID, String fn, String ln) {
        this.SID = SID;
        firstName = fn;
        lastName = ln;
    }

    Applicant(int SID, String fn, String ln, String[] v) {
        this.SID = SID;
        firstName = fn;
        lastName = ln;
        Collections.addAll(vaccines, v);
    }

    public void addVaccine(String s) {
        vaccines.add(s);
    }

    public String toString() {
        return String.format("%d %s %s %s", SID, firstName, lastName, vaccines);
    }
}