package chapter_6_objectsandDataStructures.trainWrecks;

import chapter_6_objectsandDataStructures.lawOfDemeter.badPractice.Order;


public class OrderProcessor {
    public void processOrder(Order order) {
        // Train wreck: multiple method calls chained together
        order.getCustomer().getAddress().getCity().getZipCode().toString();  // This is hard to read and debug
    }
}

