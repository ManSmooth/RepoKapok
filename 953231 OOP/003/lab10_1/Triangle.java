//642115003 Kan Katpark

class Triangle  {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2 , double side3){
        
        this.side1 = side1 ;
        this.side2 = side2 ;
        this.side3 = side3 ;
    }

    public double getSide1() {return this.side1 ;}
    public double getSide2() {return this.side2 ;}
    public double getSide3() {return this.side3 ;}

    public double getArea() {
        double semiParameter = (this.side1 + this.side2 + this.side3) /2.0 ;
        double area = Math.sqrt( semiParameter*(semiParameter-this.side1)*(semiParameter-this.side2)*(semiParameter-this.side3) ) ;
        return area ;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3 ;
    }

    public String toString(){
        return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}
