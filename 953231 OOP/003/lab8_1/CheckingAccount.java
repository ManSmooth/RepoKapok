//642115003 Kan Katpark
import java.time.LocalDate; 

class CheckingAccount extends BankAccount {
    
    public CheckingAccount(String accoutNumber, double balance, double interestRate , LocalDate dateCreate){
        super(accoutNumber, balance, interestRate, dateCreate) ;

    }

    @Override public void withdraw(double funds){
        double balance = super.getBalance() ;
        if( balance < funds){
            System.out.println("You have not enough money");
            return ;
        }
        super.withdraw(funds);
    }

    @Override public String toString(){
        return "Checking "+super.toString() ;
    }
    
}
