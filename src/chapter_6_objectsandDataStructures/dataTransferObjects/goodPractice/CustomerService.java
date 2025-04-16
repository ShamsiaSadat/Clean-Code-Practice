package chapter_6_objectsandDataStructures.dataTransferObjects.goodPractice;

public class CustomerService {

    public CustomerDTO convertToDTO(Customer customer) {
        return new CustomerDTO(customer.getName(), customer.getPhoneNumber());
    }

}
