package Lab4_1;

public class MyIdriver {
    public static void main(String[] args) {
        MyInteger m = new MyInteger(20);
        MyInteger n = new MyInteger(11);
        int p = 20;
        System.out.printf("int p = %d, MyInteger m = %d, MyInteger n = %d\n", p, m.getValue(), n.getValue());
        System.out.println("Equality test");
        System.out.println("m equals p?");
        System.out.println(m.equals(p));
        System.out.println("m equals n?");
        System.out.println(m.equals(n));
        System.out.println("isEven isOdd isPrime");
        System.out.println("m isEven non-static");
        System.out.println(m.isEven());
        System.out.println("n isOdd non-static");
        System.out.println(n.isOdd());
        System.out.println("m isPrime non-static");
        System.out.println(m.isPrime());
        System.out.println("n isEven static");
        System.out.println(MyInteger.isEven(n));
        System.out.println("m isOdd static");
        System.out.println(MyInteger.isOdd(m));
        System.out.println("p isPrime static");
        System.out.println(MyInteger.isPrime(p));
    }
}
