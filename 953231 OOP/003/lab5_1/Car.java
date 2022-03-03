// 642115003 Kan Katpark
import java.time.Year;

class Car {
    private String make ;
    private String model ;
    private int year;
    
    public Car(String make , String model , int year){
        this.make = make ;
        this.model = model ;
        this.year = year;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean isAntique(){
        int year = Year.now().getValue();
        int carOld = year - this.year ;

        return carOld > 45 ;
    }

    public String toString(){
        String temp = String.format("Car make: %s\nCar model: %s\nCar year: %d\nIs Antique: %b",getMake(),getModel(),getYear(),isAntique());
        return temp;
    }

}
