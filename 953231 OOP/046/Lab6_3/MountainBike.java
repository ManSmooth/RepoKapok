package Lab6_3;

public class MountainBike extends Bicycle {
    private int gear;

    public MountainBike() {
        gear = 0;
    }

    public MountainBike(int speed, int gear) {
        super(speed);
        this.gear = gear;
    }

    public void gearUp() {
        if (gear < 5)
            gear++;
    }

    public void gearDown() {
        if (gear > 0)
            gear--;
    }

    @Override
    public void speedUp(int increment) {
        setSpeed(getSpeed() + (increment * gear) > 200 ? 200 : getSpeed() + (increment * gear));
    }
    
    public int getGear() {
        return gear;
    }
}
