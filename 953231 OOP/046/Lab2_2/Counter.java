package Lab2_2;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public void click() {
        count++;
    }

    public void reset() {
        count = 0;
    }

    public int getCount() {
        return count;
    }
}
