package chapter_6_ObjectsandDataStructures.hidingStructure.badExample;

public class Customer {

    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Exposing internal structure directly
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;  // Allows external modification
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;  // Allows external modification
    }
}
