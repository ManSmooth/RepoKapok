package MiniProject;

import java.util.ArrayList;

public class Hand extends ArrayList<Card> {
    public int cardSum() {
        int sum = 0;
        int ace = 0;
        for (Card p : this) {
            int x = p.getValue();
            if (x == 1) {
                ace += 1;
            }
            sum += x;
        }
        while (sum <= 11 && ace != 0) {
            sum += 10;
            ace -= 1;
        }
        return sum;
    }

    public void draw(int n, int m) {
        for (int i = 0; i < n; i++) {
            this.add(new Card(false));
        }
        for (int i = 0; i < m; i++) {
            this.add(new Card(true));
        }
    }

    public void show() {
        forEach(Card::show);
    }

    @Override
    public String toString() {
        String x = "";
        for (Card p : this) {
            x += p.getSuits() + p.getFace() + " ";
        }
        x += "(" + this.cardSum() + ")";
        return x;
    }
}
