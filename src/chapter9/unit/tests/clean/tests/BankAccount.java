package chapter9.unit.tests.clean.tests;

//Production Code
public class BankAccount {
    private int balance;

    public void deposit(int amount) {
            balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
