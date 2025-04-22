package chapter3.function.avoid.sideeffects;

public class BadExample {
    // Bad: A function with a side effect
    public void updateOrderStatus(String orderId) {
        String orderStatus = "Processed";
    }

}
