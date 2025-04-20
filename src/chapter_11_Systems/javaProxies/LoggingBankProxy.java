package chapter_11_Systems.javaProxies;

public class LoggingBankProxy implements Bank{

    private final Bank realBank;

    public LoggingBankProxy(Bank realBank) {
        this.realBank = realBank;
    }

    @Override
    public void deposit(double amount) {
        long start = System.currentTimeMillis();
        System.out.println("[LOG] Calling Deposit("+ amount +")");
        realBank.deposit(amount);
        System.out.println("[LOG] deposit took "+ (System.currentTimeMillis() - start) + "ms");
    }

    @Override
    public void withdraw(double amount) {
        long start = System.currentTimeMillis();
        System.out.println("[LOG] Calling withdraw("+ amount +")");
        realBank.withdraw(amount);
        System.out.println("[LOG] withdraw took "+ (System.currentTimeMillis() - start) + "ms");
    }
}
