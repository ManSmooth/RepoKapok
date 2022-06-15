public class MyQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        // System.out.println(q.isEmpty());

        q.enQueue("John");
        q.enQueue("Man");
        q.enQueue("Pree");
        System.out.println(q.size());
        // System.out.println(q.front());
        // System.out.println(q.tail());

        while (!q.isEmpty()) {
            q.printQueue();
            System.out.println(q.deQueue());
        }

    }
}
