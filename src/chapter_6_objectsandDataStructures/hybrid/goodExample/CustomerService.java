package chapter_6_objectsandDataStructures.hybrid.goodExample;

public class CustomerService {
    public boolean isEligibleForPromotion(Customer customer) {
        return customer.getAge() > 18;
    }

    public boolean hasValidAddress(Customer customer) {
        return customer.getAddress() != null && !customer.getAddress().isEmpty();
    }
}
