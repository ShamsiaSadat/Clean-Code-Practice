package chapter6.objects.and.data.structures.train.wrecks;

import chapter6.objects.and.data.structures.law.of.demeter.bad.practice.Order;


public class OrderProcessor {
    public void processOrder(Order order) {
        // Train wreck: multiple method calls chained together
        order.getCustomer().getAddress().getCity().getZipCode().toString();  // This is hard to read and debug
    }
}

