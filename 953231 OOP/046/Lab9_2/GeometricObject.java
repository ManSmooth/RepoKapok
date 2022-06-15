package Lab9_2;

public abstract class GeometricObject implements Lab10_1.color.Colorable {
    protected String fillColor;
    protected boolean isFilled;

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return fillColor;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public abstract void howToColor();
}
