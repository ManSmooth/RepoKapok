package Lab8;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        for(int i = 9; i > 0; i--) System.out.print("\t"+i);
        System.out.println("");
        for(int i = 9; i > 0; i--) {
            System.out.print(i);
            for(int j = 9; j > 0; j--) {
                System.out.print("\t"+(i*j));
            }
            System.out.println("");
        }
    }
}
