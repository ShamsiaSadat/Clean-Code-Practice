package chapter11.systems.factory;

public class ShapeFactory {
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
