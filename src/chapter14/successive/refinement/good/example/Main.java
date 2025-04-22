package chapter14.successive.refinement.good.example;

public class Main {
    public static void main(String[] args) {
        PaymentCalculator calc = new PaymentCalculator();
        double total = calc.calculateTotal(100, 2, 0.1, 0.2);
        System.out.println("Final total: " + total);
    }
}
