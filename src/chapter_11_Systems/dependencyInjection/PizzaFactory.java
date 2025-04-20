package chapter_11_Systems.dependencyInjection;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new CheesePizza();
        }
        return null;
    }
}
