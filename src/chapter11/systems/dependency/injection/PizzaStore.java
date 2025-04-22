package chapter11.systems.dependency.injection;

public class PizzaStore {
    private final PizzaFactory factory;

    // Inject the factory (dependency)
    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        if (pizza != null) {
            pizza.bake();
        } else {
            System.out.println("Unknown pizza type");
        }
    }
}
