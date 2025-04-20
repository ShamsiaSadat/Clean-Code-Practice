package chapter_11_Systems.javaProxies;

public class Main {
    public static void main(String[] args) {
        Bank bank = new LoggingBankProxy(new RealBank());
        bank.deposit(10000);
        bank.withdraw(1000);
    }
}
