package chapter6.objects.and.data.structures.data.transfer.objects.bad.practice;

import chapter6.objects.and.data.structures.data.transfer.objects.good.practice.Customer;

public class BadCustomerController {
    public Customer getCustomerDetails() {
        // Returning the full domain object directly — not recommended!
        return new Customer("Bob", "bob@email.com", "9876543210");
    }

    public static void main(String[] args) {
        BadCustomerController controller = new BadCustomerController();
        Customer customer = controller.getCustomerDetails();
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail()); // Exposing too much
        System.out.println("Phone: " + customer.getPhoneNumber());
        System.out.println("Email verified: " + customer.isEmailVerified()); // Business logic exposed
    }
}
