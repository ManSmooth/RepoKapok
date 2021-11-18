package tutorial1;

import java.io.*;
import java.util.*;

public class readfile {
    public static void main(String[] args) {
        final int ROW = 99;
        final int COL = 2;
        double[][] data = new double[ROW][COL];
        double[] rolling_sum = new double[ROW];
        double all_sum = 0.0;
        long start = System.nanoTime();
        long elapsed = 0;
        /**
         * Change package name accordingly or don't put it in any package at all. t1.csv
         * should be in the same folder as the source code.
         * Below: try-with-resource block.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(
                new File(readfile.class.getPackageName().length() > 0 ? readfile.class.getPackageName() + "\\t1.csv"
                        : "t1.csv")))) {
            String in;
            int roll = 0;
            while ((in = br.readLine()) != null) {
                if (roll == ROW) {
                    //The result will be faulty if file is larger than the array.
                    throw new ArrayIndexOutOfBoundsException("File is larger than Array."); 
                }
                String[] temp = in.split(",");
                double a = Double.parseDouble(temp[0]);
                double b = Double.parseDouble(temp[1]);
                data[roll][0] = a;
                data[roll][1] = b;
                rolling_sum[roll] += a + b;
                all_sum += a + b;
                roll++;
            }
            elapsed = System.nanoTime() - start;
        } catch (ArrayIndexOutOfBoundsException|IOException e) {
            System.out.print("\u001B[31m"); //Red Error
            e.printStackTrace();
        }
        /**
         * Begin printing the result
         */
        System.out.print("\u001B[0m"); //Reset Color
        System.out.println("Sum of top 5:");
        for(double num: Arrays.copyOfRange(rolling_sum, 0, 5)) {
            System.out.printf("%16.9f\n", num);
        }
        System.out.println("Sum of bottom 5:");
        for(double num: Arrays.copyOfRange(rolling_sum, rolling_sum.length - 5, rolling_sum.length)) {
            System.out.printf("%16.9f\n", num);
        }
        System.out.println("SUM:");
        System.out.printf("%16.9f\n", all_sum);
        System.out.printf("Process Runtime: %d us", elapsed / 1000);
    }
}