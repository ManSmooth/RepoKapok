package Lab4_1;

public class MyPdriver {
    public static void main(String[] args) {
        MyPoint m = new MyPoint();
        MyPoint n = new MyPoint(10, 30.5);
        System.out.printf("m = (%.2f,%.2f)\nn = (%.2f,%.2f)\n", m.getX(), m.getY(), n.getX(), n.getY());
        System.out.println("dist non static");
        System.out.println("m dist n");
        System.out.println(m.dist(n));
        System.out.println("m dist (3.0, 4.0)");
        System.out.println(m.dist(3.0, 4.0));
        System.out.println("dist static");
        System.out.println("m dist n");
        System.out.println(MyPoint.dist(n, m));
    }
}
