package chapter_9_UnitTests.keepingTestsClean;

import chapter_9_UnitTests.theThreeLawsOfTDD.MyCalculator;
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
