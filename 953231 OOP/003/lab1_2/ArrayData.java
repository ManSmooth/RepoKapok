import java.util.Scanner;
public class ArrayData {
    public static void main(String[] args) {
        int arr[] = new int[999];

        int arrLength = readData(arr);
        System.out.println("array has length :" + arrLength);
        displayData(arr, arrLength);
    }

    public static int readData(int[] arr){
        int c = 0 ;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while(x != -999){
            arr[c] = x;
            c++;
            x = input.nextInt();
        }
        return c;
    }

    public static void displayData(int[] arr, int c){
        for(int i = 0 ; i < c ;i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
