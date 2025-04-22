package practice.of.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.meow();

        myCat.eat();       // Inherited from Animal
        myCat.sleep();     // Inherited from Animal
    }
}
