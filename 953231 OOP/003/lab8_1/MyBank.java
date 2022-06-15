//642115003 Kan Katpark
import java.time.LocalDate;
public class MyBank {
    public static void main(String[] args) {
        System.out.println("--------------- Checking Account ---------------");
        CheckingAccount ac1 = new CheckingAccount("0001", 500.00, 0.003, LocalDate.of(2007, 10, 07));
        System.out.println(ac1);
        ac1.withdraw(510);
        ac1.withdraw(50);
        System.out.println(ac1);
        
        System.out.println("--------------- Saving Account ---------------");
        SavingAccount ac2 = new SavingAccount("0002", 500, 0.0025, LocalDate.now(), 2);
        System.out.println(ac2);
        ac2.withdraw(300);
        System.out.println(ac2);
        ac2.withdraw(100);
        System.out.println(ac2);
        ac2.withdraw(100);
    }
}