//642115003 Kan Katpark

import java.time.LocalDate;
import java.util.*; 

class Circle {
    private double radius ;
    private boolean isFilled ;
    private String color ;

    public Circle(double radius , boolean isFilled , String color){
        this.radius = radius ;
        this.isFilled = isFilled ;
        this.color = color ;
    }

    public String toString() {
        return "Circle radius: " + this.radius + " Color: " + this.color + " isFilled: "+ this.isFilled ;
    }
}


class Loan {
    private String name ;
    private double amount ;

    public Loan(String name , double amount){
        this.name = name ;
        this.amount = amount ;
    }

    public String toString() {
        return "Name: " + this.name + "  Amount: " + this.amount ;
    }

}

public class myArray {
    public static void main(String[] args) {
        
        ArrayList<Object> arr = new ArrayList() ;
        arr.add("Test String");
        arr.add(121);
        arr.add(3.14);
        arr.add(LocalDate.now());
        arr.add(new Loan("A",144.5));
        arr.add(new Circle(3.4, true, "Black"));

        for(int i = 0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }

    }
}
