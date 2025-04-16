package chapter_10_Classes.keepingClassesOrganized;

public class BankAccount {
    //Group variables at the top.
    //Keep private methods below public methods.
    //Keep related methods close together.
    
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}
