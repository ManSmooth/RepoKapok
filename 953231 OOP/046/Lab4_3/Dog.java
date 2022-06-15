package Lab4_3;

public class Dog {
    private String name;
    private double age;

    public Dog(String n, double y) {
        name = n;
        age = y;
    }

    public double getPersonYear() {
        return age * 7;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String toString() {
        return String.format("Name: %s\tAge: %.0f\tPerson-Year: %.0f", name, Math.floor(age), Math.floor(getPersonYear()));
    }
}
