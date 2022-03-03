//642115003 Kan Katpark

public class Circle {

    private double radius ;

    public Circle(){

        this.radius = 1;
    }

    public Circle( double r){
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