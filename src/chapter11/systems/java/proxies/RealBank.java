package chapter11.systems.java.proxies;

public class RealBank implements Bank{
    @Override
    public void deposit(double amount) {
        System.out.println("Deposit $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("withdraw $" + amount);
    }


}
