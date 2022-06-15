package Lab6_3;

import java.util.concurrent.ThreadLocalRandom;

public class TestBike {
    public static void main(String[] args) {
        Bicycle b = new Bicycle(20);
        System.out.println(b.getSpeed());
        System.err.println();
        b.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        b.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        b.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        b.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        b.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        System.out.println();
        b.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        b.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        b.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        b.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        b.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.println(b.getSpeed());
        System.out.println();

        MountainBike m = new MountainBike(20, 1);
        m.gearUp();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.gearUp();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.gearUp();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.gearUp();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.gearUp();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        System.out.println();
        m.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.applyBrake(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        System.out.println();
        m.gearDown();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.gearDown();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.gearDown();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.gearDown();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
        m.gearDown();
        m.speedUp(ThreadLocalRandom.current().nextInt(0, 100));
        System.out.printf("%d, %d\n", m.getSpeed(), m.getGear());
    }
}
