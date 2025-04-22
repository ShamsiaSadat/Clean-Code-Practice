package chapter9.unit.tests.the.three.laws.of.tdd;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    void testAddTwoNumbers() {
        MyCalculator calc = new MyCalculator();
        assertEquals(5, calc.add(2, 3));
    }
}
