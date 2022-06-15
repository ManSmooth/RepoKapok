package Lab5_1;

public class NumWords {
    public static void main(String[] args) {
        String s = "This is a seven words long sentence";
        System.out.printf("%s: %d",s ,wordCount(s));
    }

    public static int wordCount(String s) {
        return s.split(" ").length;
    }
}


