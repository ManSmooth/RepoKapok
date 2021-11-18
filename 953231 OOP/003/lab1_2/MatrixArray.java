import java.util.Scanner;
public class MatrixArray {
    public static void main(String[] args) {
        double[][] arr  = new double[3][4];
        
        readData(arr);
        displayData(arr);

        for(int i =0 ;i <4;i++){
        System.out.println("sum of element in col: "+i+" = " + sumColumn(arr,i));
        }
    }

    public static void readData(double[][] arr){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length;i++){
            for(int y = 0; y < arr[1].length;y++){
                arr[i][y] = input.nextInt();
            }
        }
    }

    public static void displayData(double[][] arr){
        for(int i = 0; i < arr.length;i++){
            for(int y = 0; y < arr[1].length;y++){
                System.out.print(arr[i][y] + " ");
            }
            System.out.println();
        }        
    }

    public static double sumColumn(double[][] arr, int columnIndex){
        double sum = 0;
        for(int i =0 ;i <3;i++){
            sum += arr[i][columnIndex];
           
        }
        return sum;
    }
}
