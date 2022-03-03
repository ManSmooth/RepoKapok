//642115003
public class MyBook {
    public static void main(String[] args) {
        ReadingMaterialBook b1 = new ReadingMaterialBook("SomeBook", 121);
        System.out.println(b1.toString());

        Novel b2 = new Novel("Journey of Elaina", 370, "Elaina", "Fantasy");
        System.out.println(b2.toString());

        Textbook b3 = new Textbook("MATH 101", 12, "Calculus");
        System.out.println(b3.toString());
        System.out.println(b3.getContent());
    }
}
