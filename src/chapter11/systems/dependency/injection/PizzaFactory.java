package chapter11.systems.dependency.injection;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new CheesePizza();
        }
        return null;
    }
}
