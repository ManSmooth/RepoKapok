//642115003 Kan Katpark
class Bicycle {

    private int speed;
    private int speedlimit = 99;

    public Bicycle(int speed) {
        this.speed = speed;
    }

    public Bicycle() {
        this.speed = 0;
    }

    public void speedUp(int increment) {
        if (this.speed + increment >= speedlimit) {
            // System.out.println("Speed out of bond");
            setSpeed(speedlimit);
            return;
        }
        this.speed += increment;
    }

    public void applyBreak(int decrement) {
        if (this.speed - decrement <= 0) {
            // System.out.println("Speed out of bond");
            setSpeed(0);
            return;
        }
        this.speed -= decrement;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setLimit(int l) {
        this.speedlimit = l;
    }
}