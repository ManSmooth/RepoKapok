package Lab2_1;

public class MyCar {
    public static void main(String[] args) {
        Car toyota = new Car("Red");
        Car honda = new Car("Blue");
        toyota.setSpeed(200);
        toyota.setMileage(1345);
        honda.setSpeed(300);
        honda.setMileage(8987);
        // Display
        System.out.printf("Toyota\nColor: %s\nSpeed: %d\nMileage: %d\n\n", toyota.getColor(), toyota.getSpeed(),
                toyota.getMileage());
        System.out.printf("Honda\nColor: %s\nSpeed: %d\nMileage: %d\n\n", honda.getColor(), honda.getSpeed(),
                honda.getMileage());
    }
}
