package Lab4_3;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Hondi", 2020);
        Car c2 = new Car("A", "B", 1111);
        Car c3 = new Car("", "", 0);

        System.out.println(c1);
        System.out.println(c1.isAntique());
        c1.setMake("Toyota");
        c1.setModel("Toyoti");
        c1.setYear(1975);
        System.out.println(c1);
        System.out.println(c1.isAntique());

        System.out.println(c2);
        System.out.println(c2.isAntique());
        c2.setMake("B");
        c2.setModel("C");
        c2.setYear(1976);
        System.out.println(c2);
        System.out.println(c2.isAntique());

        System.out.println(c3);
        System.out.println(c3.isAntique());
        c3.setMake("84");
        c3.setModel("73");
        c3.setYear(2021);
        System.out.println(c3);
        System.out.println(c3.isAntique());
    }
}
