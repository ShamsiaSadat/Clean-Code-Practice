package chapter6.objects.and.data.structures.law.of.demeter.good.practice;

public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

}
