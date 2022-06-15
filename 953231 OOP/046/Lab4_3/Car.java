package Lab4_3;
import java.util.Calendar;


public class Car {
    private String Make;
    private String Model;
    private int Year;

    public String getMake() {
        return this.Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getModel() {
        return this.Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getYear() {
        return this.Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public Car(String Make, String Model, int Year) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
    }

    public String toString() {
        return String.format("Make: %s Model: %s Year: %d", Make, Model, Year);
    }

    public boolean isAntique() {
        return Calendar.getInstance().get(Calendar.YEAR) - Year > 45;
    }
}
