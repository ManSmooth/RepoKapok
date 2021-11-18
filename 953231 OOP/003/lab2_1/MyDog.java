// 642215003 Kan Katpark
import DogClass.*;
public class MyDog {
    public static void main(String[] args) {
        Dog poddle = new Dog("White",10.5);

        System.out.println("The color of my dog is " + poddle.getColor());
        System.out.println("The weight of my dog is "+ poddle.getWeight());
    }
}
