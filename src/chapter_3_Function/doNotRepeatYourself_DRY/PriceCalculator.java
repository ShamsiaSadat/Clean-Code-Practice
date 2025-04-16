package chapter_3_Function.doNotRepeatYourself_DRY;

    public class PriceCalculator {
        private static final double DISCOUNT_RATE = 0.9;

        public double calculatePrice(double price, int quantity) {
            return price * quantity * DISCOUNT_RATE;
        }
    }
