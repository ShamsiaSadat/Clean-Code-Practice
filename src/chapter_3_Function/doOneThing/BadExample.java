package chapter_3_Function.doOneThing;

public class BadExample {

    // Bad: A function that combines validation and processing
    public void processPayment(String paymentId) {
        if (!isValidPayment(paymentId)) {
            throw new IllegalArgumentException("Invalid payment");
        }
        chargeCustomer(paymentId);
    }

    private boolean isValidPayment(String paymentId) {
        return false;
    }

    private void chargeCustomer(String paymentId) {
    }

}
