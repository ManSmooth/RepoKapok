//642115003 Kan Katpark

import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Double> arr = new ArrayList<>();

        insertMockData(arr, 50);
        System.out.println("Original arraylist\n" + arr);

        System.out.println("Do merge sort....");

        mergeSort(arr);
        System.out.println("Sorted arraylist\n" +arr);
    }

    public static void mergeSort(ArrayList<Double> arr) {
        if (arr.size() <= 1)
            return;

        int center = arr.size() / 2;

        ArrayList<Double> halfLeft = new ArrayList<Double>(arr.subList(0, center));
        ArrayList<Double> halfRight = new ArrayList<Double>(arr.subList(center, arr.size()));

        mergeSort(halfLeft);
        mergeSort(halfRight);

        merge(arr, halfLeft, halfRight);

    }

    public static void merge(ArrayList<Double> arr, ArrayList<Double> halfLeft, ArrayList<Double> halfRight) {
        int leftSize = halfLeft.size();
        int rightSize = halfRight.size();
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (halfRight.get(j) < halfLeft.get(i)) {
                arr.set(k, halfRight.get(j));
                j++;
            } else {
                arr.set(k, halfLeft.get(i));
                i++;
            }
            k++;
        }

        while (i < leftSize) {
            arr.set(k, halfLeft.get(i));
            i++;
            k++;
        }

        while (j < rightSize) {
            arr.set(k, halfRight.get(j));
            j++;
            k++;
        }

    }

    public static void insertMockData(ArrayList<Double> arr, int l) {
        for (int i = 0; i < l; i++) {
            arr.add(((int) (Math.random() * 100000)) / 100.00);
        }
    }


}
