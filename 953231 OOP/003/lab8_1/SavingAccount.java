//642115003 Kan Katpark
import java.time.LocalDate;

class SavingAccount extends BankAccount {
    
    private int withdrawLimit ;

    public SavingAccount(String accoutNumber, double balance, double interestRate , LocalDate dateCreate, int withdrawLimit){
        super(accoutNumber, balance, interestRate, dateCreate) ;
        this.withdrawLimit = withdrawLimit ;
    }

    @Override public void withdraw(double funds){
        if(withdrawLimit <= 0){
            System.out.println("You cann't withdraw more in this month");
            return ;
        }
        this.withdrawLimit -= 1 ;
        super.withdraw(funds);
    }
     
    @Override public String toString(){
        return "Saving "+super.toString() + " Withdraw limit: " + this.withdrawLimit ;
    }
}
