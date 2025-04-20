package chapter_6_ObjectsandDataStructures.lawOfDemeter.goodPractice;

public class GoodExampleOrder {

    private Customer customer;

    public GoodExampleOrder(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerCity() {
        return customer.getCity();  // Now only one level deep
    }
}

