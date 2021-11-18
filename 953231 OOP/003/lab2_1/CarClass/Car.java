// 642215003 Kan Katpark
package CarClass ;
public class Car{
    private String color ;
    private int speed ;
    private int milage ;

    public Car(String col){
        color = col ;
        speed = 0 ;
        milage = 0;
    }

    public String getColor() {
        return this.color ;
    }

    public int getSpeed(){
        return this.speed ;
    }

    public int getMilage(){
        return this.milage ;
    }

    public void setSpeed(int speed){
        this.speed = speed ;
    }

    public void setMilage(int milage){
        this.milage = milage ;
    }

}