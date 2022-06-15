package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;

public class stackPostfix {
    static final String operators = "+-*/^";
    static ArrayList<Character> c = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        String path = "Assignment3/input.txt";
        if (args.length > 1) {
            path = args[0].equals("-i") ? args[1] : path;
        }
        Scanner s = new Scanner(new File(path));
        while (s.hasNextLine()) {
            try {
                System.out.println(eval(s.nextLine().replaceAll(" ", "")));
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    public static String eval(String eq) {
        StringBuilder sb = new StringBuilder();
        MyStack<Integer> stack = new MyStack<>();
        stack.push((int) '(');
        eq += ")";
        boolean operatorCheck = false;
        boolean operandCheck = false;
        for (int i = 0; i < eq.length(); i++) {
            char curr = eq.charAt(i);
            if (curr == '(') {
                stack.push((int) curr);
                operandCheck = false;
            } else if (curr == ')') {
                if (stack.empty()) {
                    throw new RuntimeException("Invalid Infix Expression: Parentheses Parity Check failed");
                }
                char curr2;
                while ((curr2 = (char) stack.pop().intValue()) != '(' && !stack.empty()) {
                    sb.append(curr2);
                }
            } else if (operators.indexOf(curr) != -1) {
                int prec;
                if (operatorCheck) {
                    throw new RuntimeException("Invalid Infix Expression: Double Operator");
                }
                if (!operandCheck) {
                    throw new RuntimeException("Invalid Infix Expression: Binary Operator Check failed");
                }
                if (stack.empty()) {
                    stack.push((int) curr);
                    operatorCheck = true;
                } else if ((prec = Prec(curr)) > Prec((char) stack.peek().intValue())) {
                    stack.push((int) curr);
                    operatorCheck = true;
                } else {
                    while (Prec((char) stack.peek().intValue()) >= prec) {
                        sb.append((char) stack.pop().intValue());
                    }
                    stack.push((int) curr);
                    operatorCheck = true;
                }
            } else if ((curr >= 'a' && curr <= 'z') || (curr >= 'A' && curr <= 'Z') || (curr >= '0' && curr <= '9')) {
                operatorCheck = false;
                operandCheck = true;
                sb.append(curr);
            }
            else {
                throw new RuntimeException("eval: Unsupported Character Error");
            }
        }
        if (!stack.empty())
            throw new RuntimeException("Invalid Infix Expression: Parentheses Parity Check failed");
        if (operatorCheck)
            throw new RuntimeException("Invalid Infix Expression: Binary Operator Check failed");
        return sb.toString();
    }

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':   
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}
class MyStack<T> {
    scuffedLinkedList<T> stack = new scuffedLinkedList<>();

    public void push(T t) {
        stack.insert(t);
    }

    public T pop() {
        T temp = stack.get(stack.getSize() - 1);
        stack.delete(stack.getSize() - 1);
        return temp;
    }

    public T peek() {
        return stack.get(stack.getSize() - 1);
    }

    public boolean empty() {
        return stack.getSize() == 0;
    }
}

class scuffedLinkedList<T> {
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
        if (index == 1 && getSize() == 2) {
            head.next = null;
            return;
        }
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
}

