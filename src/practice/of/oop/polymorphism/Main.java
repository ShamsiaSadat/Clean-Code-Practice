package practice.of.oop.polymorphism;

public class Main {

    public static void main(String[] args) {

        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound();
    }
}
