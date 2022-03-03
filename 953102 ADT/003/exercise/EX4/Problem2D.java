public class Problem2D {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            if (i <= 4) {
                for (int j = 0; j < 10 - i; j++) {
                    System.out.print(arr[i][j]);
                }
            } else if (i == 5) {
                continue;
            } else {
                for (int j = 9 - i ; j < 10; j++) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
