package chapter6.objects.and.data.structures.law.of.demeter.bad.practice;

public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerCity() {
        return customer.getAddress().getCity();
    }


    public chapter6.objects.and.data.structures.train.wrecks.Customer getCustomer() {
        return null;
    }
}

