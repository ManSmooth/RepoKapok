package Lab1;

public class Repetition_B {
    public static void main(String[] args) {
        int roller = 0;
        int accu = 1;
        while (accu < 1000000) {
            roller++;
            accu *= 2;
        }
        System.out.println(roller);
        System.out.println(accu);
    }
}
