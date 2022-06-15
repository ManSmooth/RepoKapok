package Lab6_4;

public class AccountDriver {
    public static void main(String[] args) {
        Account a = new Account(1, 5000);
        CheckingAccount ca = new CheckingAccount(2, 5000);
        SavingAccount sa = new SavingAccount(3, 5000, 7000);
        a.withdraw(7000);
        System.out.println(a);
        ca.withdraw(500);
        ca.withdraw(5000);
        System.out.println(ca);
        sa.withdraw(6000);
        sa.withdraw(2000);
        System.out.println(sa);
    }
}
