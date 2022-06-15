package tutorial5;

import java.util.Scanner;

class scuffedQueue {
    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;

    public scuffedQueue(int size) {
        this.maxSize = size;
        this.queueArray = new String[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(String item) {
        queueArray[rear++] = item;
    }

    public String dequeue() {
        return queueArray[front++];
    }

    public String peek() {
        return queueArray[front];
    }

    public boolean isFull() {
        return (rear - front == maxSize);
    }

    public boolean isEmpty() {
        return (rear - front == 0);
    }

    @Override
    public String toString() {
        String temp = "[";
        String temp2 = "";
        for (int i = front; i < maxSize; i++) {
            temp2 += String.format(i == maxSize - 1 ? "%s" : "%s, ", this.queueArray[i]);
        }
        temp += temp2 + "]";
        return String.format("%s [first = %d, rear = %d, length = %d]", temp, front, rear, rear - front);
    }
}

public class scuffedQueueDriver {
    public static void main(String[] args) {
        final int SIZE = 5;
        scuffedQueue queue = new scuffedQueue(SIZE);
        String[] in = new String[SIZE];
        int roller = 0;
        String key = "";
        boolean flag = false;
        System.out.println("Please enter students' name (enter 'quit' to exit the program)");
        Scanner p = new Scanner(System.in);
        while (!flag) {
            key = p.next();
            if (flag = key.equalsIgnoreCase("quit")) {
                break;
            }
            in[roller++] = key;
        }
        p.close();
        for (int i = 0; i < roller; i++) {
            queue.enqueue(in[i]);
            System.out.println("Enqueue " + in[i]);
            System.out.println(queue);
        }
        System.out.println("Dequeue " + queue.dequeue());
        System.out.println(queue);
    }
}
