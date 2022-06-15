package Lab6_3;

public class Bicycle {
    private int speed;

    public Bicycle() {
        speed = 0;
    }

    public Bicycle(int speed) {
        this.speed = speed;
    }

    public void speedUp(int increment) {
        speed = speed + increment > 99 ? 99: speed + increment;
    }

    public void applyBrake(int decrement) {
        speed = speed - decrement < 0 ? 0: speed - decrement;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
