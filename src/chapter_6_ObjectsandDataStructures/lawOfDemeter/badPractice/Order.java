package chapter_6_ObjectsandDataStructures.lawOfDemeter.badPractice;

public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerCity() {
        return customer.getAddress().getCity();
    }


    public chapter_6_ObjectsandDataStructures.trainWrecks.Customer getCustomer() {
        return null;
    }
}

