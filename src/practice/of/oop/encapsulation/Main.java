package practice.of.oop.encapsulation;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setName("Ali");
        person1.setAge(12);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}
