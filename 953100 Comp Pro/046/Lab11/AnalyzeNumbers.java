package Lab11;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        Double[] numbers = new Double[n];
        double sum = 0;
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;
        int count = 0;
        for (double x : numbers)
            if (x > average)
                count++;
        printArray(numbers);
        System.out.printf("Average is %.5f\n", average);
        System.out.println("Number of elements above the average is " + count);
        System.out.println("Minimum number is " + findMin(numbers));
        System.out.println("Maximum number is " + findMax(numbers));
        input.close();
    }

    private static <T> void printArray(T[] x) {
        String out = "[";
        for (int i = 0; i < x.length; i++) {
            out += x[i];
            if (i != x.length - 1) {
                out += ", ";
            }
        }
        out += "]";
        System.out.println(out);
    }

    private static double findMax(Double[] x) {
        double max = Double.NEGATIVE_INFINITY;
        for (double d : x) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    private static double findMin(Double[] x) {
        double min = Double.POSITIVE_INFINITY;
        for (double d : x) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }
}
