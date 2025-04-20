package chapter_6_ObjectsandDataStructures.dataTransferObjects.goodPractice;

public class CustomerDTO {

    private String name;
    private String phoneNumber;

    public CustomerDTO(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }

}
