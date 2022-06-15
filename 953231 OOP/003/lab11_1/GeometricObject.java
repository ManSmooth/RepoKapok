//642115003 Kan Katpark

abstract class GeometricObject {
    
    private String color ;
    private boolean isFilled ;

    public GeometricObject(String color , boolean isFilled) {
        this.color = color ;
        this.isFilled = isFilled ;
    }

    abstract double getArea();
    abstract double getPerimeter() ;

    public String getColor() {
        return this.color ;
    }

    public boolean isFilled(){
        return this.isFilled ;
    }

}