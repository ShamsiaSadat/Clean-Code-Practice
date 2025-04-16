package chapter_9_unitTests.cleanTests.oneAssertperTest;

import chapter_9_unitTests.cleanTests.BankAccount;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.*;

public class BankAccountTest {

    //Bad Practice
    @Test
    void testBankAccountOperations() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(300);

        assertEquals(700, account.getBalance());
        assertTrue(account.getBalance() < 1000);
        assertFalse(account.getBalance() == 0);
    }

    //Good Practice
    @Test
    void withdrawShouldReduceBalance() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(300);

        assertEquals(700, account.getBalance());
    }

    @Test
    void balanceShouldBeLessThanInitialAfterWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(300);

        assertTrue(account.getBalance() < 1000);
    }

    @Test
    void balanceShouldNotBeZeroAfterWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(300);

        assertNotEquals(0, account.getBalance());
    }
}
