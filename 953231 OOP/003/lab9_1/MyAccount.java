//642115003 Kan Katpark
public class MyAccount {
    public static void main(String[] args) {
        Account a1 = new Account(1122,"George",1000) ;
        Account.setAnnualInterestRate(1.5);

        a1.deposit(30);
        a1.deposit(40);
        a1.deposit(50);

        a1.withdraw(5);
        a1.withdraw(4);
        a1.withdraw(2);

        a1.printAccount();
    }
}
