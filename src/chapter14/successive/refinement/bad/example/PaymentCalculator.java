package chapter14.successive.refinement.bad.example;

public class PaymentCalculator {
    public double calculateTotal(double price, int quantity, double taxRate, double discount) {
        double total = price * quantity;
        total = total - (total * discount);
        total = total + (total * taxRate);
        return total;
    }
}
