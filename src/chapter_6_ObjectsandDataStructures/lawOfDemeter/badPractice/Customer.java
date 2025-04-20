package chapter_6_ObjectsandDataStructures.lawOfDemeter.badPractice;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
