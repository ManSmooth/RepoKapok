package Lab1_2;

public class TempConv {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        for (int i = 0; i < 9; i++) {
            System.out.printf("%d\t%d\n", (5 * i) + 40, cToF((5 * i) + 40));
        }
    }

    static int cToF(int x) {
        return (int) Math.round(((9.0/5.0) * x) + 32);
    }
}
