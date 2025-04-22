package chapter6.objects.and.data.structures.hiding.structure.good.example;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor
    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Providing controlled access to the internal structure
    public String getName() {
        return name;
    }

    // Providing controlled access to the address
    public String getAddress() {
        return address;
    }

    public boolean updateAddress(String newAddress) {
        if (isValidAddress(newAddress)) {
            this.address = newAddress;
            return true;
        }
        return false;
    }

    // Controlled access to phone number
    public boolean updatePhoneNumber(String newPhoneNumber) {
        if (isValidPhoneNumber(newPhoneNumber)) {
            this.phoneNumber = newPhoneNumber;
            return true;
        }
        return false;
    }

    // Example validation methods
    private boolean isValidAddress(String address) {
        // Add real address validation here
        return address != null && !address.trim().isEmpty();
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Add real phone number validation here
        return phoneNumber != null && phoneNumber.matches("\\d{10}");
    }
}
