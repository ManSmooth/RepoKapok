//642115003 Kan Katpark

public class ComparableCircle extends Circle implements Comparable {
    
    public ComparableCircle(double r){
        super(r);
    }

    @Override public int compareTo(Circle y) {
        if(super.getRadius() > y.getRadius()) return 1 ;
        if(super.getRadius() < y.getRadius()) return -1 ;

        return 0 ;
        
    }

}
