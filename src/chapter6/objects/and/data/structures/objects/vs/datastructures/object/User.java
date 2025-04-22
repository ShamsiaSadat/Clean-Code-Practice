package chapter6.objects.and.data.structures.objects.vs.datastructures.object;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }
}
