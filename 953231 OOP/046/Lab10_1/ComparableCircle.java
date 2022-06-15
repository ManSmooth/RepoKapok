package Lab10_1;

public class ComparableCircle extends Lab4_2.Circle2d implements Comparable<ComparableCircle> {

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double x_, double y_, double radius_) {
        super(x_, y_, radius_);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return (int)Math.signum(this.getRadius() - o.getRadius());
    }
}
