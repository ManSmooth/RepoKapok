package Lab6_4;

import java.text.SimpleDateFormat;

public class Account {
    private int PID;
    private double balance;
    private static double rate = 1;
    private java.util.Date date;

    public Account(int PID, double balance) {
        this.PID = PID;
        this.balance = balance;
        date = new java.util.Date();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRate() {
        return rate;
    }

    public String toString() {
        return String.format("%d($%.2f) Created: %s", PID, balance,
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date));
    }
}
