package chapter_7_ErrorHandling;

public class BankTransfer {

    private int balance = 50;

    public Result transfer(int amount) {
        if (amount > balance) {
            return new Result(false, "Insufficient funds");
        }
        balance -= amount;
        return new Result(true, "Transfer successful");
    }

    public void run() {
        Result result = transfer(100);
        System.out.println(result.getMessage());
    }
}
