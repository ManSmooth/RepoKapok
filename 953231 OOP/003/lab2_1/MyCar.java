// 642215003 Kan Katpark
import CarClass.Car;
public class MyCar {
    public static void main(String[] args) {
        Car toyota = new Car("Red");
        
        toyota.setSpeed(200);
        toyota.setMilage(1345);
        System.out.println("Toyota: "+ toyota.getColor() + " speed: " + toyota.getSpeed() + " mileage: " + toyota.getMilage());
    
        Car honda = new Car("Blue");
        honda.setSpeed(300);
        honda.setMilage(8987);
        System.out.println("Honda: "+ honda.getColor() + " speed: " + honda.getSpeed() + " mileage: " + honda.getMilage());
    
    
    }
}
