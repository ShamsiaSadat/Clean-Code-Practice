package chapter_6_objectsandDataStructures.lawOfDemeter.badPractice;

public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerCity() {
        return customer.getAddress().getCity();
    }


    public chapter_6_objectsandDataStructures.trainWrecks.Customer getCustomer() {
        return null;
    }
}

