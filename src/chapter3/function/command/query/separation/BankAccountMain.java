package chapter3.function.command.query.separation;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ali", 1000.0);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Initial balance: $" + account.getBalance());

        // Check before withdrawing (query)
        if (account.canWithDraw(300.0)) {
            account.withdraw(300.0); // Command
        }

        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Deposit money (command)
        account.deposit(150.0);

        System.out.println("Balance after deposit: $" + account.getBalance());

        // Try to withdraw more than balance
        account.withdraw(1000.0); // Not allowed
    }
}
