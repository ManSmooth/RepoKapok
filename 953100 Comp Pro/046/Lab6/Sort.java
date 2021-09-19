package Lab6;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> p = new ArrayList<>();
        System.out.print("Enter num1: "); 
        int num1 = input.nextInt(); 
        System.out.print("Enter num2: "); 
        int num2 = input.nextInt();
        System.out.print("Enter num3: "); 
        int num3 = input.nextInt();
        input.close();
        p.add(num1);
        if(num2 > num1) {
            p.add(num2);
            if(num3 > num2) p.add(num3);
            else if(num3 > num1) p.add(1,num3);
            else p.add(0,num3);
        }
        else {
            p.add(0,num2);
            if(num3 > num1) p.add(num3);
            else if(num3 > num2) p.add(1,num3);
            else p.add(0,num3);
        }
        p.forEach(x -> System.out.printf("%d ", x));
    }
}
