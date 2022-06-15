package Lab4_2;

import java.util.Vector;

public class StackofInteger extends Vector<Integer> {
    public StackofInteger() {
        super();
    }

    public StackofInteger(int size) {
        super(size);
    }

    public Integer peek() {
        return this.get(this.size() - 1);
    }

    public void push(Integer i) {
        this.add(i);
    }

    public Integer pop() {
        return this.remove(this.size() - 1);   
    }

    public boolean empty() {
        return this.size() == 0;
    }
}
