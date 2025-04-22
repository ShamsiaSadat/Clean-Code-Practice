package chapter9.unit.tests.clean.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount();
    }

    @Test
    void DepositShouldIncreaseBalance() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void WithDrawShouldDecreaseBalance() {
        account.deposit(100);
        account.withdraw(40);
        assertEquals(60, account.getBalance());
    }

    @Test
    void withdrawShouldWorkWhenSufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(100);

        assertEquals(100, account.getBalance());
    }

}
