//642115003 Kan Katpark
public class Lab72 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println(p1.distance(p2));
        System.out.println(MyPoint.distance(p1, p2));

        // MyPoint p3 = new MyPoint();
        // MyPoint p4 = new MyPoint(1,1);
        // System.out.println(p3.distance(p4));
        // System.out.println(MyPoint.distance(p3, p4));
      }
    
}
