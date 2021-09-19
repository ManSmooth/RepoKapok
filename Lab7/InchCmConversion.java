package Lab7;

public class InchCmConversion {
    public static void main(String[] args) {
        int i=1;
        System.out.print("Inches\t\tCentimetres\n");
        while(i<200)
        { 
            System.out.printf("%d\t\t\t%.2f\n", i,(float)i*2.54);
            i += 2;
        }
    }
}
