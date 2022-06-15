import java.util.*;
import java.io.*;

class Sort {
    public static void main(String[] args) throws IOException {
        Vector<Double> collection = new Vector<Double>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number or quit");

        String input = sc.nextLine();

        while (input.length() != 0) {
            collection.addElement(Double.parseDouble(input));
            System.out.println("Input Number or quit");
            input = sc.nextLine();
        }

        // display before sort data
        for (Double num : collection) {
            System.out.print(num + ",");
        }
        System.out.println();

        // sort
        selectionSort(collection);

        // display after sort data
        for (Double num : collection) {
            System.out.print(num + ",");
        }

    } // end main

    // selection sort
    public static void selectionSort(Vector<Double> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.elementAt(j) < arr.elementAt(index)) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }// end function

    // swap
    public static void swap(Vector<Double> arr, int i, int j) {
        double temp = arr.elementAt(i);
        arr.set(i, arr.elementAt(j));
        arr.set(j, temp);
    }// end function

}