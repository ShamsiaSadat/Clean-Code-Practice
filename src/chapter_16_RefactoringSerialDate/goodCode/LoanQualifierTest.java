package chapter_16_RefactoringSerialDate.goodCode;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class LoanQualifierTest {
    @Test
    void shouldQualifyWithHighIncome() {
        LoanQualifier qualifier = new LoanQualifier();
        assertTrue(qualifier.isQualified(20, 60000));
    }

    @Test
    void shouldQualifyWithModerateIncomeAndAgeOver25() {
        LoanQualifier qualifier = new LoanQualifier();
        assertTrue(qualifier.isQualified(30, 35000));
    }

    @Test
    void shouldNotQualifyIfUnder18() {
        LoanQualifier qualifier = new LoanQualifier();
        assertFalse(qualifier.isQualified(17, 60000));
    }

    @Test
    void shouldNotQualifyIfLowIncome() {
        LoanQualifier qualifier = new LoanQualifier();
        assertFalse(qualifier.isQualified(30, 20000));
    }
}

