package chapter_6_objectsandDataStructures.lawOfDemeter.badPractice;

public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
