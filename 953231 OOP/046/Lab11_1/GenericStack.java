package Lab11_1;

import java.util.Arrays;

public class GenericStack<E> {
    private Object[] arr = new Object[1];
    private int currSize = 0;

    public int getSize() {
        return currSize;
    }

    public E peek() {
        return (E) arr[currSize - 1];
    }

    public void push(E o) {
        if (++currSize > arr.length)
            extend();
        arr[currSize - 1] = o;
    }

    public E pop() {
        return (E) arr[--currSize];
    }

    public boolean isEmpty() {
        return currSize == 0;
    }

    @Override
    public String toString() {
        return String.format("stack(%d): %s", arr.length, Arrays.toString(Arrays.copyOfRange(arr, 0, currSize)));
    }

    private void extend() {
        Object[] temp_arr = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp_arr[i] = arr[i];
        }
        arr = temp_arr;
    }
}