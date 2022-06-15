import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<>();

        addNum(num, 10);
        System.out.println(num);

        mergeSort(num);
        System.out.println(num);
    }

    public static void mergeSort(Vector<Integer> num) {
        if (num.size() <= 1)
            return;

        int middle = num.size() / 2;

        Vector<Integer> leftHalf = new Vector<Integer>(num.subList(0, middle));
        Vector<Integer> rightHalf = new Vector<Integer>(num.subList(middle, num.size()));

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(num, leftHalf, rightHalf);

    }

    public static void merge(Vector<Integer> num, Vector<Integer> leftHalf, Vector<Integer> rightHalf) {
        int leftSize = leftHalf.size();
        int rightSize = rightHalf.size();

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {

            if (leftHalf.elementAt(i) < rightHalf.elementAt(j)) {
                num.set(k, leftHalf.elementAt(i));
                i++;
            } else {
                num.set(k, rightHalf.elementAt(j));
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            num.set(k, leftHalf.elementAt(i));
            i++;
            k++;
        }

        while (j < rightSize) {
            num.set(k, rightHalf.elementAt(j));
            j++;
            k++;
        }

    }

    public static void addNum(Vector<Integer> num, int l) {
        for (int i = 0; i < l; i++) {
            num.addElement((int) (Math.random() * 100));
        }
    }
}
