package chapter11.systems.dependency.injection;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza("cheese");
    }
}
