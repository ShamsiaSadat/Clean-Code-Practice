package chapter_11_Systems.scalingUp.crossCuttingConcerns;

public class GoodBankService {
    public void transfer(String from, String to, int amount) {
        System.out.println("Transferring $" + amount + " from " + from + " to " + to);
    }
}
