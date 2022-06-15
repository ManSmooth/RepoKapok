package Lab4_3;

public class Kennel {
    public static void main(String[] args) {
        Dog d1 = new Dog("Robo", 4);
        Dog d2 = new Dog("Noir", 2);
        Dog d3 = new Dog("Korn", 5);

        System.out.println(d1);
        d1.setName("Loco");
        d1.setAge(7);
        System.out.println(d1);

        System.out.println(d2);
        d2.setName("Blanc");
        d2.setAge(5.35);
        System.out.println(d2);

        System.out.println(d3);
        d3.setName("Okyu");
        d3.setAge(2.75);
        System.out.println(d3);
    }
}
