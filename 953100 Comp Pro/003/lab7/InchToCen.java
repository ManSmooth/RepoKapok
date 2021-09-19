public class InchToCen {
    public static void main(String[] args) {
        int inch = 1;
        final double INCH_CENTIMETER = 2.54 ;
        System.out.println("Inches to Centimeters");

        while(inch < 200){
            System.out.print(inch);
            System.out.print("  =  ");
            System.out.println(inch*INCH_CENTIMETER);
            inch +=2;
        }

    }
}