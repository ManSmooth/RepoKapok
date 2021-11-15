package Lab1_2;

import java.util.Arrays;
import java.io.*;

public class MatrixSum {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        double[][] n = new double[3][4];
        for (int i = 0; i < n.length; i++) {
            String[] p = a.readLine().split(" ");
            String[] temp2 = Arrays.copyOfRange(p, 0, p.length > 4 ? 4 : p.length);
            for (int j = 0; j < p.length; j++) {
                try {
                    n[i][j] = Double.parseDouble(temp2[j]);
                } catch (NumberFormatException e) {
                    continue;
                }
                
            }
        }
        for (int i = 0; i < n[0].length; i++) {
            System.out.printf("Sum of elements at column %d is: %.1f\n", i, sumColumn(n, i));
        }
        a.close();
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double accu = 0;
        for (double[] ds : m) {
            accu += ds[columnIndex];
        }
        return accu;
    }
}
