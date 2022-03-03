// 642115003 Kan Katpark
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes-Benz", "A-Class", 2022);
        System.out.println(car1.toString()  + "\n");

        car1.setYear(1970);
        System.out.println(car1.toString() + "\n");

        // Car car2 = new Car("Tesla", "B-Class", 2019);
        // System.out.println(car2.toString()  + "\n");
    }
}
