package Lab10;

public class perfectNum {
    public static boolean isPerfect(int x) {
        int tally = 0;
        for (int i = 1; i <= (x / 2); i++) {
            if(x % i == 0) {
                tally += i;
            }
        }
        return tally == x;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if(isPerfect(i + 1)) {
                System.out.println(i + 1);
            }
        }
    }
}
