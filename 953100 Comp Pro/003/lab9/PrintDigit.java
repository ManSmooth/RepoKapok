import java.util.Scanner;
public class PrintDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next() ;

        for(int i = 0 ; i < num.length() ; i++ ){
            switch(num.charAt(i)) {
                case '0' : 
                    printZero();
                    break;
                case '1' : 
                    printOne();
                    break;
                case '2' : 
                    printTwo();
                    break;
                case '3' : 
                    printThree();
                    break;
                case '4' : 
                    printFour();
                    break;
                case '5' : 
                    printFive();
                    break;
                case '6' : 
                    printSix();
                    break;
                case '7' : 
                    printSeven();
                    break;
                case '8' : 
                    printEight();
                    break;
                case '9' : 
                    printNine();
                    break;
                default : 
                    System.out.print("ERROR");
                break;
            }
        }
    }

    public static void printZero(){
        System.out.println("00000000");
        System.out.println("0      0");
        System.out.println("0      0");
        System.out.println("0      0");
        System.out.println("0      0");
        System.out.println("00000000");
        System.out.print("\n");       
    }
    public static void printOne() {
        System.out.println("   11");
        System.out.println(" 1  1");
        System.out.println("    1");
        System.out.println("    1");
        System.out.println("    1");
        System.out.println("  11111");
        System.out.print("\n");
    }
    public static void printTwo() {
        System.out.println(" 22222");
        System.out.println("2     22");
        System.out.println("     22");
        System.out.println("    22");
        System.out.println("   22");
        System.out.println(" 22222222");
        System.out.print("\n");    
    }
    public static void printThree() {
        System.out.println(" 333333");
        System.out.println("      33");
        System.out.println("  3333");
        System.out.println("      33");
        System.out.println(" 333333");
        System.out.print("\n");    
    }
    public static void printFour(){
        System.out.println("    44");
        System.out.println("  4  4");
        System.out.println(" 4   4");
        System.out.println("44444444");
        System.out.println("    4");
        System.out.print("\n");        
    }
    public static void printFive() {
        System.out.println("555555");
        System.out.println("5    ");
        System.out.println("555555");
        System.out.println("     5");
        System.out.println("555555");
        System.out.print("\n");    
    }
    public static void printSix() {
        System.out.println("666666");
        System.out.println("6    ");
        System.out.println("666666");
        System.out.println("6    6");
        System.out.println("666666");
        System.out.print("\n");        
    }
    public static void printSeven(){
        System.out.println(" 777777");
        System.out.println("     7");
        System.out.println("    7");
        System.out.println("   7");
        System.out.println("  7");
        System.out.print("\n");        
    }
    public static void printEight() {
        System.out.println("8888888");
        System.out.println("8     8");
        System.out.println("8888888");
        System.out.println("8     8");
        System.out.println("8888888");
        System.out.print("\n");        
    }
    public static void printNine() {
        System.out.println("9999999");
        System.out.println("9     9");
        System.out.println("9999999");
        System.out.println("      9");
        System.out.println("9999999");
        System.out.print("\n");
    }
}

