package Lab1;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\t%d", i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d", i);
            for (int j = 0; j < 10; j++) {
                System.out.printf("\t%d", i * j);
            }
            System.out.println();
        }
    }
}
