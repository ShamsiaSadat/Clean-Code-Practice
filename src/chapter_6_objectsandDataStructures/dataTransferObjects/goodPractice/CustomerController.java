package chapter_6_objectsandDataStructures.dataTransferObjects.goodPractice;

public class CustomerController {

    private CustomerService service = new CustomerService();

    public CustomerDTO getCustomerDetails() {
        Customer customer = new Customer("Alice", "alice@email.com", "1234567890");
        return service.convertToDTO(customer);
    }

    public static void main(String[] args) {
        CustomerController controller = new CustomerController();
        CustomerDTO dto = controller.getCustomerDetails();
        System.out.println("Name: " + dto.getName());
        System.out.println("Phone: " + dto.getPhoneNumber());
    }
}
