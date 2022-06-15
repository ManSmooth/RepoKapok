package Lab6_4;

public class CheckingAccount extends Account {
    public CheckingAccount(int PID, double balance) {
        super(PID, balance);
    }

    public void withdraw(int amount){
        if(amount <= getBalance()) {
            super.withdraw(amount);
        }
        else {
            System.out.println("Amount exceeds balance.");
        }
    }
}
