package Lab7_1;

import java.util.ArrayList;

public class _Driver {
    public static void main(String[] args) {
        ArrayList<Publication> publications = new ArrayList<>();
        publications.add(new Book("A", 64, 128 ,"A Book of Coming Dawn", "Antonio"));
        publications.add(new Book("B", 128, 256,"Brown bear's refuge", "Bernouli"));
        publications.add(new Book("C", 256, 512,"Charred Air", "Charlie"));
        publications.add(new Magazine("D", 512, 1024,"Daunted Dollies", "Weekly"));
        publications.add(new Magazine("E", 1024, 2048,"Error 404: Time not found", "Monthly"));
        publications.add(new Magazine("F", 2048, 4096,"Farmlife", "Biweekly"));
        publications.add(new KidsMagazine("G", 4096, 8192,"Grannies' Grand", "Biweekly", 4, 8));
        publications.add(new KidsMagazine("H", 8192, 16384,"Honey?, Honey!", "Weekly", 8, 12));
        publications.add(new KidsMagazine("I", 16384, 32768,"Iron guards", "Biweekly", 12, 16));
        publications.add(new Book("J", 32768, 65536,"Jarring Jarred Jams", "Johnny"));
        for (Publication publication : publications) {
            publication.print();
        }
    }
}
