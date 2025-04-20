package chapter_15_JUnitInternals.goodTest;

import chapter_15_JUnitInternals.TaxCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    TaxCalculator calculator = new TaxCalculator();

    @Test
    void shouldCalculate10PercentTax() {

        double amount = 100.0;
        double taxRate = 0.10;

        double expected = 10.0;
        double actual = calculator.calculateTax(amount, taxRate);

        assertEquals(expected, actual, "Tax should be 10% of the amount");
    }

    @Test
    void shouldCalculate15PercentTax() {
        TaxCalculator calculator = new TaxCalculator();

        double amount = 200.0;
        double taxRate = 0.15;

        double expected = 30.0;
        double actual = calculator.calculateTax(amount, taxRate);

        assertEquals(expected, actual, "Tax should be 15% of the amount");
    }
}
