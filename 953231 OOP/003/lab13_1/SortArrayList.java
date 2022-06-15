//642115003 Kan Katpark

import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;

        list.add(0);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);

        sort(list);
        System.out.println(list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        for(int i = 1 ; i < list.size() ; i++){
            int j = i -1 ;
            E key = list.get(i) ;
            while( j >= 0 && (list.get(j).compareTo(key) != -1) ){
                swap(list,j,j+1);
                j--;
            }

        }
    }

   public static <E extends Comparable<E>>  void swap(ArrayList<E> list , int i , int j){
       E temp = list.get(i) ;
       list.set(i , list.get(j));
       list.set(j , temp );
   }
}