package chapter6.objects.and.data.structures.law.of.demeter.good.practice;

public class GoodExampleOrder {

    private Customer customer;

    public GoodExampleOrder(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerCity() {
        return customer.getCity();  // Now only one level deep
    }
}

