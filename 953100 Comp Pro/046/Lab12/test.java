package Lab12;

public class test {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        System.out.println(matrix.length);
        System.out.println(matrix[3][3]);
    }
    static void sort(int a, int b, int c) {
        if(a > b) {
            a += b;
            b = a - b;
            a -= b;
        }
        if(a > c) {
            a += c;
            c = a - c;
            a -= c;
        }
        if(b > c) {
            b += c;
            c = b - c;
            b -= c;
        }
        System.out.printf("Sorted Values are %d, %d, %d", a, b, c);
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
