package chapter6.objects.and.data.structures.law.of.demeter.bad.practice;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
