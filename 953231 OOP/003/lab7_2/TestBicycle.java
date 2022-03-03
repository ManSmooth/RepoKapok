//642115003 Kan Katpark
import java.util.*;

class TestBicycle {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(20);
        Random ran = new Random();

        System.out.println("///////////Bicycle///////////");

        for (int i = 0; i < 5; i++) {
            b1.speedUp(ran.nextInt(99));
            System.out.println("Speed: " + b1.getSpeed());
        }

        for (int i = 0; i < 5; i++) {
            b1.applyBreak(ran.nextInt(99));
            System.out.println("Speed: " + b1.getSpeed());
        }

        MountainBike b2 = new MountainBike(20, 1);
        System.out.println("///////////Mountain bike///////////");
        for (int i = 0; i < 5; i++) {
            b2.speedUp(ran.nextInt(99));
            System.out.println("Speed: " + b2.getSpeed() + " Gear: " + b2.getGear());
            b2.gearUp();
        }

        for (int i = 0; i < 5; i++) {
            b2.applyBreak((ran.nextInt(99)));
            System.out.println("Speed: " + b2.getSpeed() + " Gear: " + b2.getGear());
        }

        for (int i = 0; i < 5; i++) {
            b2.speedUp(ran.nextInt(99));
            System.out.println("Speed: " + b2.getSpeed() + " Gear: " + b2.getGear());
            b2.gearDown();
            
        }

    }
}