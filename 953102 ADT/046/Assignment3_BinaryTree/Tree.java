package Assignment3_BinaryTree;

import java.util.ArrayList;

public class Tree<T> {
    private Node head;
    private ArrayList<Tree<? extends T>> Branches = new ArrayList<>();

    public Tree() {
        this.head = new Node(null);
    }

    public Tree(T data) {
        this.head = new Node(data);
    }

    public T getData() {
        return head.getData();
    }

    public int size() {
        return Branches.size();
    }

    public void setData(T data) {
        head.setData(data);
    }

    public Tree<? extends T> get(int index) {
        return Branches.get(index);
    }

    public void add(Tree<T> tree) {
        Branches.add(tree);
    }

    public String toPostfix() {
        StringBuilder _sb = new StringBuilder();
        for (Tree<? extends T> tree : Branches) {
            _sb.append(tree.toPostfix());
        }
        return String.format("%s %s", _sb.toString(), getData());
    }

    public String toPrefix() {
        StringBuilder _sb = new StringBuilder();
        for (Tree<? extends T> tree : Branches) {
            _sb.append(tree.toPrefix());
        }
        return String.format("%s %s", getData(), _sb.toString());
    }

    public String toInfix() { // BINARY TREE ONLY
        if (size() > 2)
            throw new RuntimeException("toInfix() cannot be used with non-binary tree");
        if (size() == 0) {
            return String.format("%s", getData());
        }
        return String.format("(%s %s %s)", get(0).toInfix(), getData(), get(1).toInfix());
    }

    private class Node {
        T data;

        Node(T data) {
            this.data = data;
        }

        protected void setData(T data) {
            this.data = data;
        }

        protected T getData() {
            return data;
        }
    }
}
