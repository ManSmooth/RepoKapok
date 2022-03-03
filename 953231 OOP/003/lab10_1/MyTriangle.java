//642115003 Kan Katpark

public class MyTriangle {
    public static void main(String[] args) {
        try{
            TriangleWithException t2 =  new TriangleWithException(3.0, 3.0, 3.0);
            System.out.println(t2.getPerimeter());
            System.out.println(t2.getArea());

            TriangleWithException t1 =  new TriangleWithException(0.0, 0.0, 1.0);
            System.out.println(t1.getPerimeter());
            System.out.println(t1.getArea());
        }catch(IllegalTriangleException err) {
            System.out.println(err);
        }
    }
}
