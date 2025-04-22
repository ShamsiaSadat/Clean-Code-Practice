package practice.of.oop.encapsulation;

public class Person {

    private String name;
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public int getAge() {
        return age;
    }
}
