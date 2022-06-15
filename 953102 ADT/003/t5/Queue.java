import java.util.Vector;

class Queue {
    private Vector<Object> collection;
    private int maxQueue;
    private int size;

    public Queue(int max) {
        this.maxQueue = max;
        this.collection = new Vector<Object>();
        this.size = 0;
    }

    public void enQueue(Object x) {
        if (this.size >= this.maxQueue) {
            System.out.println("Queue is full! ");
            return;
        }

        size++;
        collection.addElement(x);
    }

    public Object deQueue() {
        if (this.size <= 0) {
            System.out.println("Queue is empty! ");
            return null;
        }

        size--;
        return this.collection.remove(0);
    }

    public boolean isEmpty() {
        return !(size > 0);
    }

    public int front() {
        return 0;
    }

    public int tail() {
        return this.size - 1;
    }

    public int size() {
        return this.size;
    }

    public void printQueue() {
        String output = "[";

        for (int i = 0; i < maxQueue; i++) {
            try {
                output += collection.elementAt(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                output += "NULL";
            }
            if (i != maxQueue - 1)
                output += ",";
        }
        output += "] first: " + front() + " rear: " + (tail()+1) + " Length: " + size();
        System.out.println(output);
    }

    public boolean isFull() {
        return this.size == this.maxQueue;
    }

}