package Lab4_1;

public class MyInteger {
    private int value;
    public MyInteger(int i) {
        value = i;
    }
    public int getValue() {
        return value;
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static boolean isEven(MyInteger n) {
        return n.getValue() % 2 == 0;
    }
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }
    public static boolean isOdd(MyInteger n) {
        return n.getValue() % 2 == 1;
    }
    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < (n / 2); i++) {
            if(n % i == 0) flag = false;
        }
        return flag;
    }
    public static boolean isPrime(MyInteger n) {
        boolean flag = true;
        for (int i = 2; i < (n.getValue() / 2); i++) {
            if(n.getValue() % i == 0) flag = false;
        }
        return flag;
    }
    public boolean equals(int n) {
        return value == n;
    }
    public boolean equals(MyInteger n) {
        return value == n.getValue();
    }
    public boolean isEven() {
        return value % 2 == 0;
    }
    public boolean isOdd() {
        return value % 2 == 1;
    }
    public boolean isPrime() {
        boolean flag = true;
        for (int i = 2; i < (value / 2); i++) {
            if(value % i == 0) flag = false;
        }
        return flag;
    }
}
