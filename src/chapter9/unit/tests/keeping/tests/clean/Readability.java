package chapter9.unit.tests.keeping.tests.clean;

import chapter9.unit.tests.the.three.laws.of.tdd.MyCalculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Readability {
    //tests should be easy to understand at a glance. A test should tell a clear story about what is being tested and why.
    //bad
    @Test
    public void test1() {
        assertEquals(24, CalculatingService.calculate(16, 8));
    }

    //Good
    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = MyCalculator.multiply(6, 4);
        assertEquals(24, result);
    }
}
