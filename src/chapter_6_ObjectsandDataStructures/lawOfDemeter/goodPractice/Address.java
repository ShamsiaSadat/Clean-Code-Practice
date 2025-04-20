package chapter_6_ObjectsandDataStructures.lawOfDemeter.goodPractice;

public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

}
