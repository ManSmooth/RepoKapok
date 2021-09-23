package MiniProject;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Card {
    private int face;
    private int suit;
    private boolean hidden;
    private static Map<Integer, String> faceTable = new HashMap<Integer, String>();
    private static Map<Integer, String> suitTable = new HashMap<Integer, String>();
    private static Map<Integer, String> suit2Table = new HashMap<Integer, String>();
    static {
        faceTable.put(1, "A");
        faceTable.put(2, "2");
        faceTable.put(3, "3");
        faceTable.put(4, "4");
        faceTable.put(5, "5");
        faceTable.put(6, "6");
        faceTable.put(7, "7");
        faceTable.put(8, "8");
        faceTable.put(9, "9");
        faceTable.put(10, "10");
        faceTable.put(11, "J");
        faceTable.put(12, "Q");
        faceTable.put(13, "K");
        suitTable.put(1, "♠");
        suitTable.put(2, "♥");
        suitTable.put(3, "♦");
        suitTable.put(4, "♣");
        suit2Table.put(1, "s");
        suit2Table.put(2, "h");
        suit2Table.put(3, "d");
        suit2Table.put(4, "c");
    }

    public Card(boolean hidden) {
        this.face = ThreadLocalRandom.current().nextInt(1, 14);
        this.suit = ThreadLocalRandom.current().nextInt(1, 5);
        this.hidden = hidden;
    }

    public Card(int face, int suit, boolean hidden) {
        this.face = face;
        this.suit = suit;
        this.hidden = hidden;
    }

    public String getFace() {
        return hidden ? "X" : faceTable.get(face);
    }

    public int getValue() {
        return hidden ? 0 : face > 10 ? 10 : face;
    }

    public String getSuits() {
        return hidden ? "X" : suitTable.get(suit);
    }

    public void show() {
        this.hidden = false;
    }

    public String getFile() {
        return hidden ? "Red_back.jpg" : String.format("%s%s.jpg", faceTable.get(face), suit2Table.get(suit));
    }
}
