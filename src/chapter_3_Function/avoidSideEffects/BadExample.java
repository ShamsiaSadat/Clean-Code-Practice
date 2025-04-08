package chapter_3_Function.avoidSideEffects;

public class BadExample {
    // Bad: A function with a side effect
    public void updateOrderStatus(String orderId) {
        String orderStatus = "Processed";
    }

}
