package chapter_9_unitTests.keepingTestsClean;

import chapter_9_unitTests.theThreeLawsOfTDD.MyCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExampleCleanAndBadTest {

    //Bad Example
    @Test
    public void testSomething() {
        MyCalculator c = new MyCalculator();
        int x = c.add(2, 3);
        if (x == 5) {
            System.out.println("ok");
        } else {
            System.out.println("fail");
        }
    }


    //Good Example
    @Test
    public void shouldAddTwoNumbersCorrectly() {
        int result = CalculatingService.calculate(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void shouldAddNegativeNumbers() {
        int result = CalculatingService.calculate(-2, -3);
        assertEquals(-5, result);
    }
}
