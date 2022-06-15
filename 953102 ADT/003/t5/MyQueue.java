import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        final int MAX_QUEUE_SIZE = 5;
        Queue myqueue = new Queue(MAX_QUEUE_SIZE);

        Scanner scan = new Scanner(System.in);
        String input = "";

        while (!(input.equals("quit"))) {
            System.out.print("Please Enter student name or 'quit' to exit program: ");
            input = scan.next();

            if (input.equals("quit")) {
                break;
            }

            if (myqueue.size() >= MAX_QUEUE_SIZE) {
                System.out.println("Dequeue: " + myqueue.deQueue());
                myqueue.printQueue();
            }
            myqueue.enQueue(input);
            System.out.println("Enqueue: " + input);
            myqueue.printQueue();
        }
    }

}
