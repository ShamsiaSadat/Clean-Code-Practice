package practice.of.oop.abstraction;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        Circle shape3 = new Circle();

        shape3.print();



        shape1.draw();
        shape1.area();

        shape2.draw();
        shape2.area();
    }
}
