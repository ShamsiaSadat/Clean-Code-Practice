package chapter6.objects.and.data.structures.hybrid.good.example;

public class CustomerService {
    public boolean isEligibleForPromotion(Customer customer) {
        return customer.getAge() > 18;
    }

    public boolean hasValidAddress(Customer customer) {
        return customer.getAddress() != null && !customer.getAddress().isEmpty();
    }
}
