//642115003 Kan Katpark

public class Circle2D {

    private double x ;
    private double y;
    private double radius ;

    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x , double y , double r){
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2) ;
    }
    
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
}
