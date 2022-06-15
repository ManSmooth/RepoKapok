//642115003 Kan Katpark
import java.time.LocalDate;

class BankAccount {
    private String accountNumber ;
    private double balance ;
    private double interestRate ;
    private LocalDate dateCreate ;

    //Constructor
    public BankAccount(String accoutNumber, double balance, double interestRate , LocalDate dateCreate ){
        this.accountNumber = accoutNumber ;
        this.balance = balance ;
        this.interestRate = interestRate ;
        this.dateCreate = dateCreate ;
    }

    public void desposit(double funds) {
        this.balance += funds ;
    }

    public void withdraw(double funds){
        this.balance = this.balance - funds ;
    }

    //Getter method
    public String getAccountNumber() {
        return this.accountNumber ;
    }

    public double getBalance() {
        return this.balance ;
    }

    //Setter method
    public void setBalance(double balance){
        this.balance = balance ;
    }

    //ToString method
    public String toString() {
        return "Account: " + this.accountNumber + "  Balance: " + this.balance +" Created At: " + this.dateCreate;
    }


}