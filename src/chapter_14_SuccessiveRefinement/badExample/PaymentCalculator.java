package chapter_14_SuccessiveRefinement.badExample;

public class PaymentCalculator {
    public double calculateTotal(double price, int quantity, double taxRate, double discount) {
        double total = price * quantity;
        total = total - (total * discount);
        total = total + (total * taxRate);
        return total;
    }
}
