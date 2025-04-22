package chapter6.objects.and.data.structures.data.transfer.objects.good.practice;

public class CustomerService {

    public CustomerDTO convertToDTO(Customer customer) {
        return new CustomerDTO(customer.getName(), customer.getPhoneNumber());
    }

}
