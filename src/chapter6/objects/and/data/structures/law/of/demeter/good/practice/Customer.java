package chapter6.objects.and.data.structures.law.of.demeter.good.practice;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public String getCity() {
        return address.getCity();  // Moving the responsibility here
    }
}
