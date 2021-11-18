package Lab2_1;

public class Car {
    private String color;
    private int speed, mileage;

    public Car(String color_) {
        color = color_;
        speed = 0;
        mileage = 0;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
