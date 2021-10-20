package MiniProject;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class HandPanel extends JPanel {
    private Hand d;

    public HandPanel() {
        d = new Hand();
        this.setSize(1280, 160);
        this.setLayout(new FlowLayout());
    }

    public void draw(int n, int m) {
        d.draw(n, m);
        try {
            refresh();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reveal() {
        d.show();
        try {
            refresh();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void refresh() throws IOException {
        this.removeAll();
        for (Card card : d) {
            this.add(new CardFrame(card));
        }
        this.revalidate();
    }

    public void addCard(int face, int suit, boolean hidden) {
        d.add(new Card(face, suit, hidden));
        try {
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getValue() {
        return d.cardSum();
    }

    public void reset(int n, int m) {
        d = new Hand();
        this.draw(n, m);
    }
    
    public Hand getHand() {
        return this.d;
    }
}
