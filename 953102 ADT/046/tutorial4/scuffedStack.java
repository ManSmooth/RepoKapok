package tutorial4;

public class scuffedStack {
    private double[] elements;
    private int pointer;
    private int maxSize;

    public scuffedStack(int size) {
        maxSize = size;
        elements = new double[maxSize];
        pointer = -1;
    }

    public void push(double in) {
        elements[++pointer] = in;
    }

    public double pop() {
        return elements[pointer--];
    }

    public double peek() {
        return elements[pointer];
    }

    public boolean isFull() {
        return pointer == maxSize - 1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }
    
    //
    // VISUALIZATION
    //

    // public String toString() {
    //     String temp = "";
    //     for (int i = 0; i < elements.length; i++) {
    //         if(i == pointer) {
    //             temp += String.format("[%.2f] ", elements[i]);
    //         } else {
    //             temp += String.format("%.2f ", elements[i]);
    //         }
    //     }
    //     return temp;
    // }
}
