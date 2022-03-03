//642115003 Kan Katpark
import java.util.*;

public class Account {
  private int id;
  private String name ;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;
  private ArrayList<Transactions> transactions ;

  public Account() {
    dateCreated = new java.util.Date();
  }

  public Account(int id , String name , double balance ) {
    this.id = id ;
    this.name = name ;
    this.balance = balance ;
    this.dateCreated = new java.util.Date() ;
    this.transactions = new ArrayList<Transactions>() ;
  }

  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
  }

  public ArrayList<Transactions> getTransactions() {
    return this.transactions ;
  }

  public String getName() {
    return this.name ;
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    double temp = this.balance ;
    balance -= amount;

    String description = "Withdraw Money " + temp + " - "+ amount + " = " + this.balance  ;
    Transactions transac = new Transactions('W', amount, balance, description) ;
    transactions.add(transac) ;
  }

  public void deposit(double amount) {
    double temp = this.balance ;
    balance += amount;

    String description = "Deposit Money " + temp + " + "+ amount + " = " + this.balance  ;
    Transactions transac = new Transactions('D', amount, balance, description) ;
    transactions.add(transac) ;
  }

  public void printAccount() {
    System.out.println("Account holder: " + this.name);
    System.out.println("Interest Rate: " + getAnnualInterestRate());
    System.out.println("Balance: " + this.balance );
    System.out.println("Transction: ");

    for(int i = 0 ; i < transactions.size() ; i++){
      if(i != 0 )System.out.println();
      System.out.println(transactions.get(i).toString());
    }

  }

}

