//642115003 Kan Katpark

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int[] arr = new int[100] ;
    
        assignValue(arr) ;
        // displayArray(arr) ;
        
        System.out.print("Select index[0-99]: ");
        int index = in.nextInt() ;

        selectArrayIndex(index,arr) ;
    }

    public static void selectArrayIndex(int index , int[] arr){
        try{
            System.out.println("Value is " + arr[index]);
        }catch(ArrayIndexOutOfBoundsException err) {
            System.out.println("Out of bond");
        }
    }

    public static void assignValue(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            int temp = (int)(Math.random() * 100) ;
            arr[i] = temp ;
        }
    }

    public static void displayArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.printf("Index:%d Value: %d \n", i , arr[i]);
        }
    }
}
