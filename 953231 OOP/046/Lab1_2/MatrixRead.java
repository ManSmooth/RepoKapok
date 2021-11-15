package Lab1_2;

import java.util.Scanner;

public class MatrixRead {
    static Scanner p = new Scanner(System.in);

    public static void main(String[] args) {
        int[] x = new int[10];
        printList(x, readData(x));
    }

    public static int readData(int[] x) {
        int cnt = 0;
        String temp = p.nextLine();
        Scanner runner = new Scanner(temp);
        while (runner.hasNext()) {
            if(cnt == 10) {
                break;
            }
            if(runner.hasNextInt()) {
                int curr = runner.nextInt();
                if(curr == -999) {
                    break;
                }
                else {
                    x[cnt] = curr;
                    cnt++;
                }
            }
        }
        runner.close();
        return cnt;
    }

    public static void printList(int[] x, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",x[i]);
        }
    }
}
