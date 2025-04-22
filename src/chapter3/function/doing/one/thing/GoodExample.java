package chapter3.function.doing.one.thing;

public class GoodExample {
    // Good: Two separate functions for validation and processing
    public void validatePayment(String paymentId) {
        if (!isValidPayment(paymentId)) {
            throw new IllegalArgumentException("Invalid payment");
        }
    }

    private boolean isValidPayment(String paymentId) {
        return false;
    }

    public void processPayment(String paymentId) {
        validatePayment(paymentId);
        chargeCustomer(paymentId);
    }

    private void chargeCustomer(String paymentId) {
    }
}
