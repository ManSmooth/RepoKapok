//642115003 Kan Katpark

public class Triangle extends GeometricObject {

    private double side1 ;
    private double side2 ;
    private double side3 ;

    public Triangle(double side1 , double side2 , double side3 , String color ,boolean isFilled){
        super(color, isFilled);
        this.side1 = side1 ;
        this.side2 = side2 ;
        this.side3 = side3 ;
    }

    @Override public double getArea(){
        double semiParameter = (this.side1 + this.side2 + this.side3) /2.0 ;
        double area = Math.sqrt( semiParameter*(semiParameter-this.side1)*(semiParameter-this.side2)*(semiParameter-this.side3) ) ;
        return area ;
    }

    @Override public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3)  ;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
    
}
