import java.lang.reflect.Method;

class PrintNum {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Iterative");
        iterativePrint(n);
        System.out.println("Recursive");
        recursivePrint(n);

    }

    public static void iterativePrint(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }

    public static Method recursivePrint(int n) {
        System.out.println(n);
        if (n == 1) return null;
        return recursivePrint(n - 1);

    }

}