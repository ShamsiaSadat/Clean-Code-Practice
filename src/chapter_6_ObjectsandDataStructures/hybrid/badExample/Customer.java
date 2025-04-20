package chapter_6_ObjectsandDataStructures.hybrid.badExample;

public class Customer {
    private String name;
    private String address;
    private int age;

    // Constructor
    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Methods that change data directly, which should ideally be in a service or controller
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods that should ideally not be in a data structure
    public boolean isEligibleForPromotion() {
        return this.age > 18;  // Business logic mixed with data
    }

    public boolean hasValidAddress() {
        return this.address != null && !this.address.isEmpty();  // Business logic mixed with data
    }
}