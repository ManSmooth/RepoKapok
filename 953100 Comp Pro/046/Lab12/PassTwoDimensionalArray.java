package Lab12;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = getArray();
        System.out.println("\nSum of all elements is " + sum(m));
        printArr(m);
    }
    public static int[][] getArray() {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [3][4];
        System.out.printf("Enter %d rows and %d columns:\n", arr.length, arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        return arr;
    }
    public static int sum(int[][] in) {
        int accumulator = 0;
        for (int[] is : in) {
            for (int is2 : is) {
                accumulator += is2;
            }
        }
        return accumulator;
    }
    public static void printArr(int[][] in) {
        String temp = "";
        for (int[] is : in) {
            temp += "[";
            for (int is2 : is) {
                temp += is2 + " "; 
            }
            temp = temp.trim();
            temp += "]\n";
        }
        System.out.println(temp);
    }

    public static void printArr(char[][] in) {
        String temp = "";
        for (char[] is : in) {
            temp += "[";
            for (char is2 : is) {
                temp += is2 + " "; 
            }
            temp = temp.trim();
            temp += "]\n";
        }
        System.out.println(temp);
    }
    public static void printArr(char[] in) {
        String temp = "[";
        for (char c : in) {
            temp += c + " ";
        }
        temp = temp.trim();
        temp += "]";
        System.out.println(temp);
    }
}
