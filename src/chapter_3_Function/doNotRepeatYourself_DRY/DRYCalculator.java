package chapter_3_Function.doNotRepeatYourself_DRY;

public class DRYCalculator {
        private final PriceCalculator calculator = new PriceCalculator();

        public double calculateForRegularCustomer(double price, int quantity) {
            return calculator.calculatePrice(price, quantity);
        }

        public double calculateForPremiumCustomer(double price, int quantity) {
            return calculator.calculatePrice(price, quantity);
        }

        public void run() {
            System.out.println("Regular Customer: $" + calculateForRegularCustomer(100, 2));
            System.out.println("Premium Customer: $" + calculateForPremiumCustomer(200, 3));
        }

        public static void main(String[] args) {
            new DRYCalculator().run();
        }

}
