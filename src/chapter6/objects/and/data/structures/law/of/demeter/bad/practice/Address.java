package chapter6.objects.and.data.structures.law.of.demeter.bad.practice;

public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
