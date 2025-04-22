package chapter3.function.command.query.separation;

import java.lang.ref.SoftReference;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double startingBalance){
        this.accountHolder = accountHolder;
        this.balance = startingBalance;
    }

    //QUERY: Returns the account balance (does NOT modify anything)
    public double getBalance(){
        return balance;
    }

    // QUERY: Checks if you can withdraw the given amount
    public boolean canWithDraw(double amount) {
        return amount <= balance;
    }

    //COMMAND: Performs the withdrawal (only if allowed)
    public void withdraw(double amount) {
        if (canWithDraw(amount)) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    //QUERY: Returns account holder name
    public String getAccountHolder() {
        return accountHolder;
    }

    //COMMAND: Deposit money (modifies balance)
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
}
