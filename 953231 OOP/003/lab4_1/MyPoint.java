//642115003 Kan Katpark
public class MyPoint {
    private double x ;
    private double y;

    public MyPoint(){
        this.x = 0 ;
        this.y = 0 ;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    public double distance(MyPoint p){
        double temp = (Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
        return Math.sqrt(temp);
    }

    public static double distance(MyPoint p1 , MyPoint p2){
        double temp = (Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        return Math.sqrt(temp);
    }

}
