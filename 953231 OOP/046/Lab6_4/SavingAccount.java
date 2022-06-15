package Lab6_4;

public class SavingAccount extends Account{
    private double limit;
    private double monthly;
    public SavingAccount(int PID, double balance, double limit) {
        super(PID, balance);
        this.limit = limit;
    }

    public void withdraw(int amount){
        if(amount + monthly <= limit) {
            super.withdraw(amount);
            monthly += amount;
        }
        else {
            System.out.println("Exceeds monthly limit.");
        }
    }

    public String toString() {
        return String.format("%s\nMonthly Limit: %.2f/%.2f", super.toString(), monthly, limit);
    }
}
