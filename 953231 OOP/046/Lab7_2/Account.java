package Lab7_2;

import java.text.SimpleDateFormat;

public class Account {
  private int id;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;
  private String name;
  private java.util.ArrayList<Transaction> transactions;

  public Account() {
    dateCreated = new java.util.Date();
    transactions = new java.util.ArrayList<>();
  }

  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
    transactions = new java.util.ArrayList<>();
  }

  public Account(String newName, int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
    name = newName;
    transactions = new java.util.ArrayList<>();
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

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
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

  public java.util.ArrayList<Transaction> getTransactions() {
      return transactions;
  }

  public void setTransactions(java.util.ArrayList<Transaction> transactions) {
      this.transactions = transactions;
  }

  public void withdraw(double amount, String desc) {
    balance -= amount;
    transactions.add(new Transaction('W', amount, balance, desc));
  }

  public void deposit(double amount, String desc) {
    balance += amount;
    transactions.add(new Transaction('D', amount, balance, desc));
  }
}

class Transaction {
  private java.util.Date date;
  private char type;
  private double amount;
  private double balance;
  private String description;

  public java.util.Date getDate() {
    return this.date;
  }

  public void setDate(java.util.Date date) {
    this.date = date;
  }

  public char getType() {
    return this.type;
  }

  public void setType(char type) {
    this.type = type;
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  Transaction(char newType, double newAmount, double newBalance, String newDesc) {
    date = new java.util.Date();
    type = newType;
    amount = newAmount;
    balance = newBalance;
    description = newDesc;
  }

  @Override
  public String toString() {
    return String.format("[%s] %s %.2f(%s%.2f) %s", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date),
        type == 'W' ? "Withdraw" : type == 'D' ? "Deposit" : type, balance, type == 'W' ? "-" : type == 'D' ? "+" : "",
        amount, description);
  }
}