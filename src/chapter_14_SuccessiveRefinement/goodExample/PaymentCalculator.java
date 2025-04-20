package chapter_14_SuccessiveRefinement.goodExample;

public class PaymentCalculator {
    public double calculateTotal(double price, int quantity, double taxRate, double discountRate) {
        double subtotal = calculateSubtotal(price, quantity);
        double discountedTotal = applyDiscount(subtotal, discountRate);
        return applyTax(discountedTotal, taxRate);
    }

    private double calculateSubtotal(double price, int quantity) {
        return price * quantity;
    }

    private double applyDiscount(double amount, double discountRate) {
        return amount - (amount * discountRate);
    }

    private double applyTax(double amount, double taxRate) {
        return amount + (amount * taxRate);
    }
}
