package chapter_3_Function.avoidSideEffects;

public class GoodExample {

    // Good: Avoid side effects
    public String getOrderStatus(String orderId) {
        String orderStatus = "Good";
        return orderStatus;  // Just returns the status, no side effects
    }
}
