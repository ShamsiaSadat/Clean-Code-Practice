package chapter6.objects.and.data.structures.data.transfer.objects.good.practice;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Business logic (not exposed in API)
    public boolean isEmailVerified() {
        return this.email != null && this.email.contains("@");
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
}
