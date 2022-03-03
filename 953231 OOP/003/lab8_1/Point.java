//642115003 Kan Katpark
class Point {
    private double x;    
    private double y;
    
    public Point(double x , double y){
        this.x = x ;
        this.y = y ;
    }

    public double getX() {
        return x ;
    }

    public double getY() {
        return y ;
    }

    public boolean equalPoint(Point b){
        return ( this.x == b.getX() && this.y == b.getY() );
    }

    public void printInfo() {
        System.out.println("("+this.x +","+this.y+")");
    }

}
