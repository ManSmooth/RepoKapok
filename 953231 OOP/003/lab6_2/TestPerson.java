//642115003 Kan Katpark

public class TestPerson {
    public static void main(String[] args) {
        Student person1 = new Student("Johny", "Mars", "11111", "inwza@j.com", 2);
        System.out.println(person1.toString());

        Faculty person2 = new Faculty("Jones", "Mars", "11111", "inwza001@j.com", "Google Thailand", 1500000, 10, "Backend engineer");
        System.out.println(person2.toString());

        Staff person3 = new Staff("James", "Mars", "11111", "inwza007@j.com", "Google Thailand", 1600000, "Senior Staff");
        System.out.println(person3);
    }
}
