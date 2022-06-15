import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();

        addNum(arr, 10);
        System.out.println(arr);

        int index = binarySearch(arr, 10, 0, arr.size() - 1);
        System.out.println("Index is " + index + " : " + arr.elementAt(index));
    }

    public static int binarySearch(Vector<Integer> arr, int target, int l, int r) {
        if (r >= l) {
            int middle = l + (r-l) / 2;
            // System.out.println(middle);
            if (arr.elementAt(middle) == target)
                return middle;

            if (arr.elementAt(middle) < target) {
                return binarySearch(arr, target, middle+1 , r);
            }
            if (arr.elementAt(middle) > target) {
                return binarySearch(arr, target, l, middle-1 );
            }

        }

        return -1 ;
    }

    public static void addNum(Vector<Integer> arr, int l) {
        for (int i = 0; i < l; i++) {
            arr.addElement(i + 1);
        }
    }

}    