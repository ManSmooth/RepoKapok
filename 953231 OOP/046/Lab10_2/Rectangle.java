package Lab10_2;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
  private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public boolean equals(Rectangle obj) {
    return this.getArea() == obj.getArea();
  }

  @Override
  public int compareTo(Rectangle o) {
    return (int) Math.signum(this.getArea() - o.getArea());
  }
}
