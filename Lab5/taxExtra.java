package Lab5_1;

import java.util.Scanner;

public class taxExtra {
    private static double inc;
    private static final double taxIndex[] = new  double[] {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
    public static void main(String[] args) {
        int taxSin[] = new int[] {0, 8351, 33951, 82251, 171551, 372951};
        int taxMFJ[] = new int[] {0, 16701, 67901, 37051, 208851, 372951};
        int taxMFS[] = new int[] {0, 8351, 33951, 68526, 104426, 186476};
        int taxHoH[] = new int[] {0, 11951, 45501, 117451, 190201, 372951};
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter filing status\n\t0: Single \n\t1: Married Filing Jointly or Qualifying Widow(er)\n\t2: Married Filing Separately\n\t3: Head of Household\n"); 
        char cont = input.next().toLowerCase().charAt(0);
        System.out.printf("\nEnter income: ");
        inc = input.nextDouble();
        input.close(); 
        switch(cont) {
            case '0':
            System.out.printf("Tax: %.2f", inc * getTaxRate(taxSin));
            break;
            case '1':
            System.out.printf("Tax: %.2f", inc * getTaxRate(taxMFJ));
            break;
            case '2':
            System.out.printf("Tax: %.2f", inc * getTaxRate(taxMFS));
            break;
            case '3':
            System.out.printf("Tax: %.2f", inc * getTaxRate(taxHoH));
            break;
        }
    }
    static double getTaxRate(int temp[]) {
        int index = -1;
        // List<Integer> q = new ArrayList<Integer>();
        // for (int i : temp) q.add(i);
        // int index = q.indexOf(q.stream().filter(x -> inc >= x).sorted(Collections.reverseOrder()).findFirst().get());
        for (int i = 0; i < temp.length; i++) {
            if (inc >= temp[i]) index = i;
        }
        return taxIndex[index];
    }
}
