package chapter15.junit.internals.bad.test;

import chapter15.junit.internals.TaxCalculator;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TaxCalculatorTest {
    @Test
    public void test1() {
        TaxCalculator calc = new TaxCalculator();
        assertEquals(10.0, calc.calculateTax(100, 0.1));
    }

    @Test
    public void test2() {
        TaxCalculator c = new TaxCalculator();
        double result = c.calculateTax(200, 0.15);
        assertTrue(result == 30.0);
    }
}
