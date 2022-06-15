package tutorial6;

import java.util.Collection;
import java.util.Iterator;

public class scuffedLinkedList<T> {
    private Node head;

    class Node {
        T data;
        Node next;

        Node(T t) {
            data = t;
            next = null;
        }
    }

    public scuffedLinkedList() {
        head = null;
    }

    public scuffedLinkedList(Collection<T> c) {
        head = null;
        Iterator<T> i = c.iterator();
        Node currNode = head;
        while (i.hasNext()) {
            if (head == null) {
                head = new Node(i.next());
                currNode = head;
            } else {
                currNode.next = new Node(i.next());
                currNode = currNode.next;
            }
        }
    }

    public void insert(T data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (this.head == null) {
            this.head = new_node;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public T get(int index) {
        Node currNode = this.head;
        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        return currNode.data;
    }

    public void delete(int index) {
        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode = currNode.next;
        }
        if (currNode == null) {
            throw new RuntimeException("No such element exists.");
        } else if (currNode == head) {
            head = currNode.next;
        } else if (currNode.next == null) {
            throw new RuntimeException("No such element exists.");
        } else {
            currNode.next = currNode.next != null ? currNode.next.next : null;
        }
    }

    public void deleteAll() {
        head = null;
    }

    public int getSize() {
        int size = 0;
        Node currNode = this.head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() // Traversal
    {
        Node currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
