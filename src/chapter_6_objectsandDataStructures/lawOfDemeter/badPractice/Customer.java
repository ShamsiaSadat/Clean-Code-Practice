package chapter_6_objectsandDataStructures.lawOfDemeter.badPractice;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
