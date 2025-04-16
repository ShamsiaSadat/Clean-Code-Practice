package chapter_11_Systems.separateConstructingASystemfromUsingIt.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.createShape("circle");
        shape1.draw();

        Shape shape2 = factory.createShape("square");
        shape2.draw();
    }
}
