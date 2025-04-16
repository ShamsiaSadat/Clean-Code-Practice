package chapter_11_Systems.separateConstructingASystemfromUsingIt.dependencyInjection;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza("cheese");
    }
}
