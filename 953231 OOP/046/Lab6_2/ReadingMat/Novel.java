package Lab6_2.ReadingMat;

import java.util.ArrayList;

public class Novel extends Literature {
    private ArrayList<String> mainCharacters;
    private String description;

    public Novel(String title, double price, int pages, String desc) {
        super(title, price, pages);
        mainCharacters = new ArrayList<>();
        this.description = desc;
    }

    public void addChar(String s) {
        mainCharacters.add(s);
    }

    public String toString() {
        return String.format("%s\nMain cast: %s\nDescription: %s", super.toString(), mainCharacters, description);
    }
}
