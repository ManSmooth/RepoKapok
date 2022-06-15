package Lab7_2;

public class AccountDriver {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(1.5);
        Account dummy = new Account("George", 1122, 1000);
        dummy.deposit(30, "dep1");
        dummy.deposit(40, "dep2");
        dummy.deposit(50, "dep3");
        dummy.withdraw(5, "wit1");
        dummy.withdraw(4, "wit2");
        dummy.withdraw(2, "wit3");
        System.out.printf("Name: %s\nInterest Rate: %.2f%%\nBalance: %.2f\n", dummy.getName(),
                Account.getAnnualInterestRate(), dummy.getBalance());
        for (Transaction transaction : dummy.getTransactions()) {
            System.out.println(transaction);
        }
    }
}
