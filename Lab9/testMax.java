package Lab9;

public class testMax {
    public static void main(String[] args) {
        int i = 5; 
        int j = 2;
        System.out.println("The maximum between " + i + " and " + j + " is " + max(i, j)); 
        int x = 9;
        int y = 7;
        System.out.println("The maximum between " + x + " and " + y + " is " + max(x, y)); 
        System.out.println("The maximum between " + max(i, j) + " and " + max(x, y) + " is " + max(max(i, j), max(x, y))); 

    }
    public static int max(int num1, int num2) {
        return num1 > num2? num1: num2;
    }
}

