package practice.of.oop.abstraction;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void print() {
        System.out.println("print out this");
    }
}
