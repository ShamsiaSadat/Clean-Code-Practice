package chapter_6_objectsandDataStructures.lawOfDemeter.goodPractice;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public String getCity() {
        return address.getCity();  // Moving the responsibility here
    }
}
