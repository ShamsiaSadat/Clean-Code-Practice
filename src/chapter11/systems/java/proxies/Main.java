package chapter11.systems.java.proxies;

public class Main {
    public static void main(String[] args) {
        Bank bank = new LoggingBankProxy(new RealBank());
        bank.deposit(10000);
        bank.withdraw(1000);
    }
}
