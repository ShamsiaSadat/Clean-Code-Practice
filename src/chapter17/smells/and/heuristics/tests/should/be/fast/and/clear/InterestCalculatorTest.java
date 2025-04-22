package chapter17.smells.and.heuristics.tests.should.be.fast.and.clear;

import chapter17.smells.and.heuristics.use.descriptive.names.InterestCalculator;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class InterestCalculatorTest {
    //Good Example
    @Test
    void t1() {
        assertEquals(20.0, new InterestCalculator().calculateInterest(100, 0.2));
    }

    //Bad Example
    @Test
    void shouldCalculate20PercentInterest() {
        InterestCalculator calculator = new InterestCalculator();
        double result = calculator.calculateInterest(100, 0.2);
        assertEquals(20.0, result);
    }
}
