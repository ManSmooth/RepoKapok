import java.util.*;
import java.io.*;

public class MySearch {
    public static void main(String[] args) {

        String location = "data.txt";
        File file = new File(location);

        Vector<Double> data = new Vector<Double>();

        readData(data, file);
        System.out.println("Total data number : " + data.size());

        quickSort(data, 0, data.size());
        // System.out.println(data);

        int index = search(data, 0.5 );

        // System.out.println(data.elementAt(index));
        Vector<Double> greaterThanTarget = new Vector<Double>(data.subList(index,data.size()));

        System.out.println(greaterThanTarget);
        System.out.println("Greater than 0.5 value is "+ greaterThanTarget.size());

    }// n + nlog(n)

    // n
    public static int search(Vector<Double> data , double target) {
        for(int i = 0 ; i < data.size() ; i++){
            if(data.elementAt(i) > target) return i ;
        }
        return 0 ;
    }

    // n log n
    public static void quickSort(Vector<Double> data, int l, int r) {
        if (l >= r)
            return;

        int part = partition(data, l, r);
        quickSort(data, l, part);
        quickSort(data, part+1, r);
    }

    public static int partition(Vector<Double> data, int l, int r) {
        int i = l - 1;
        double pivot = data.elementAt(r - 1);

        for (int j = l; j < r - 1; j++) {

            if (data.elementAt(j) < pivot) {
                i++;
                swap(data, i, j);
            }

        }

        swap(data, i + 1, r - 1);

        return i + 1;

    }

    public static void swap(Vector<Double> data, int i, int j) {
        double temp = data.elementAt(i);
        data.set(i, data.elementAt(j));
        data.set(j, temp);
    }

    public static void readData(Vector<Double> data, File file) {
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                double num = Double.parseDouble(sc.nextLine());
                data.addElement(num);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}