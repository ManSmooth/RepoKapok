import java.util.Vector;

class Queue {
    private Vector<Object> collection;
    private int maxQueue;
    private int count;

    public Queue(int max) {
        this.maxQueue = max;
        this.collection = new Vector<Object>();
        this.count = 0;
    }

    public void enQueue(Object x) {
        if (this.count >= this.maxQueue) {
            return ;
        }

        count++;
        collection.addElement(x);
    }

    public Object deQueue() {
        if (this.count <= 0) {
            return null;
        }

        count--;
        return this.collection.remove(0);
    }

    public boolean isEmpty() {
        return !(count > 0);
    }

    public Object front() {
        return this.collection.elementAt(0);
    }

    public Object tail() {
        return this.collection.elementAt(count - 1);
    }

    public int size() {
        return this.count;
    }

    public void printQueue() {
        System.out.println(this.collection);
    }

}