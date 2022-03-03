//642215003 Kan Katpark

import java.io.*;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Vector<Integer> data = new Vector<>();

        File file = new File("Lab20_2.txt");
        writeData(file);

        data = readData(file) ;
        quickSort(data, 0, data.size());
    
        for(int num : data){
            System.out.println(num);
        }
    }
    
    //Write random 100 integers into .txt file
    public static void writeData(File file) {
        try {
            PrintWriter pw = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                int temp = (int) (Math.random() * 100 +1);
                pw.print(temp+" ");
            }

            pw.close();

        } catch (FileNotFoundException err) {
            System.out.println(err);
        }
    }

    //Read data from .txt file and return it
    public static Vector<Integer> readData(File file) {
        Vector<Integer> data = new Vector<>() ;
        try{
            Scanner sc = new Scanner(file) ;
            while(sc.hasNext() ){
                data.addElement(Integer.parseInt(sc.next()) );
            }
            sc.close();

        }catch(FileNotFoundException err){
            System.out.println(err);
        }

        return data ;
    }

    //Sorting with quick sort
    public static void quickSort(Vector<Integer> data , int l , int r) {
        if(l >= r) return ; //base case
        //recurtion

        int parti = partition(data,l,r) ;

        quickSort(data, l, parti);
        quickSort(data, parti+1, r);

    }

    public static int partition(Vector<Integer> data , int l , int r) {
        int key = data.elementAt(r-1) ;
        int i  = l - 1 ;

        for(int j = l ; j < r-1 ; j++){
            if(data.elementAt(j) < key){
                i++ ;
                swap(data, i , j);
            }

        }
        swap(data, i+1, r-1);
        return i+1 ;
    }

    //Swap method 
    public static void swap(Vector<Integer> data , int i , int j) {
        int temp = data.elementAt(i) ;
        data.set(i, data.elementAt(j));
        data.set(j, temp);
    }   

}
