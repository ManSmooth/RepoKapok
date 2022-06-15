//642115003 Kan Katpark
import java.util.Date ;

public class Transactions {
    private Date date ;
    private char type ;
    private double amount ;
    private double balance ; 
    private String description ;

    public Transactions( char type, double amount, double balance, String description) {
        this.type = type ;
        this.amount = amount ;
        this.balance = balance ;
        this.description = description ;
        this.date = new Date() ;
    }

    public String toString() {
        return this.date + " Type: " + this.type + " Amount: " + this.amount + " Balance: " + this.balance + "\nDescription: " + this.description ; 
    }

}
