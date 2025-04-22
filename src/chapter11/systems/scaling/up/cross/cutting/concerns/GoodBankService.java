package chapter11.systems.scaling.up.cross.cutting.concerns;

public class GoodBankService {
    public void transfer(String from, String to, int amount) {
        System.out.println("Transferring $" + amount + " from " + from + " to " + to);
    }
}
