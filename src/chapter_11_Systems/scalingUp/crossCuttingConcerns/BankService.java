package chapter_11_Systems.scalingUp.crossCuttingConcerns;

public class BankService {
    public void transfer(String from, String to, int amount) {
        System.out.println("Checking permissions...");
        System.out.println("Logging transfer...");
        // Main logic
        System.out.println("Transferring $" + amount + " from " + from + " to " + to);
    }
}
