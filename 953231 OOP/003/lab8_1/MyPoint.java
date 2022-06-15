//642115003 Kan Katpark
public class MyPoint {
    public static void main(String[] args) {
        Point a = new Point(1,3) ;
        System.out.print("Point a is at ");
        a.printInfo();

        Point b = new Point(1,3) ;
        System.out.print("Point b is at ");
        b.printInfo();

        if(a.equalPoint(b)){
            System.out.println("Point a and Point b are the same. ");
        }
        else {
            System.out.println("Point a and Point b are different.");
        }
    }
}
