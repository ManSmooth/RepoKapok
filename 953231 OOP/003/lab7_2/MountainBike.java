//642115003 Kan Katpark
class MountainBike extends Bicycle {
    private int gear;

    public MountainBike() {
        this.gear = 1;
        super.setLimit(200);
    }

    public MountainBike(int speed, int gear) {
        super(speed);
        super.setLimit(200);
        this.gear = gear;
    }

    public void gearUp() {
        if (this.gear >= 5) {
            System.out.println("Gear is at limit 5");
            return;
        }
        this.gear++;

    }

    public void gearDown() {
        if (this.gear <= 1) {
            System.out.println("Gear is at limit 1");
            return;
        }
        this.gear--;
    }

    public int getGear() {
        return this.gear;
    }

    @Override
    public void speedUp(int increment) {
        int temp = increment * this.gear;
        super.speedUp(temp);
    }

}
