import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<>();

        addNum(num, 100);
        System.out.println(num);

        quickSort(num, 0 , num.size());
        System.out.println(num);
    }

    public static void quickSort(Vector<Integer> num , int l , int r ){
        if(l >= r) return ;

        int parti = partition(num,l,r);
        // System.out.println(parti);
        quickSort(num, l, parti);
        quickSort(num, parti+1, r);

    }

    public static int partition(Vector<Integer> num , int l , int r){
        int i = l - 1 ;
        int pivot = num.elementAt(r-1);

        for(int j = l ; j < r-1 ; j++){

            if(num.elementAt(j) < pivot){
                i++;
                swap(num , i , j) ;
            }

        }
        swap(num,i+1,r-1);
        return i+1 ;

    }
    
    public static void swap(Vector<Integer> num , int i , int j){
        int temp = num.elementAt(i);
        num.set(i, num.elementAt(j));
        num.set(j, temp);
    }

    public static void addNum(Vector<Integer> num, int l) {
        for (int i = 0; i < l; i++) {
            num.addElement((int) (Math.random() * 100));
        }
    }
}
