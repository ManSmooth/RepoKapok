import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<>();

        addNum(num , 10);
        System.out.println(num);

        insertionSort(num) ;
        System.out.println(num);

    }

    public static void insertionSort(Vector<Integer> num) {
        for(int i = 0 ; i < num.size() ; i++){
            int j = i-1 ;
            int key = num.elementAt(i) ;
            while( j >= 0 && key < num.elementAt(j)){
                swap(num , j , j+1);
                j--;
            }
        }

    }

    public static void swap(Vector<Integer> num , int i , int j){
        int temp = num.elementAt(i);
        num.set(i, num.elementAt(j));
        num.set(j, temp);
    }

    public static void addNum(Vector<Integer> num , int l){
        for(int i = 0 ; i < l ;i++){
            num.addElement( (int)(Math.random()*100));
        }
    }
}