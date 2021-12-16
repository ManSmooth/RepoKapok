package Lab3_2;

public class SWDriver {
    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        sw.start();
        for (int i = 0; i < 100000; i++) {
            System.out.printf("Hello\t");
        }
        sw.stop();
        System.out.printf("\nElapsed Time: %.3f secs",sw.getElapsedTime()/1000.0);
    }
}
