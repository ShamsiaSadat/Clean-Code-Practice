package chapter3.function.doNotRepeatYourself_DRY;

public class BadCalculator {
    public double calculateForRegularCustomer(double price, int quantity) {
        return price * quantity * 0.9;  // 10% discount
    }

    public double calculateForPremiumCustomer(double price, int quantity) {
        return price * quantity * 0.9;  // repeated logic!
    }

    public void run() {
        System.out.println("Regular Customer: $" + calculateForRegularCustomer(100, 2));
        System.out.println("Premium Customer: $" + calculateForPremiumCustomer(200, 3));
    }

    public static void main(String[] args) {
        new BadCalculator().run();
    }
}
