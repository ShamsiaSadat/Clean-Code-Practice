package chapter_9_UnitTests.cleanTests.F.I.R.S;

import chapter_9_UnitTests.cleanTests.BankAccount;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

public class F_I_R_S_T{
    //First
    //Good tests should run quickly, so they don’t slow down your development process.
    //Bad Example
    @Test
    void testThatSleeps() throws InterruptedException {
        Thread.sleep(10000); // 10 seconds is way too long!
        assertEquals(4, 2 + 2);
    }
    //Good Example
    @Test
    void simpleAdditionShouldWork() {
        assertEquals(4, 2 + 2);
    }

    //Independent
    //Tests should not depend on each other. One test failing should not cause others to fail.
    //Bad Example
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100);
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    //Good Example
    @Test
    void testWithdrawIndependently() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    //Repeatable
    //Tests should give the same result every time, no matter where or when they run.
    //Bad Example
    @Test
    void testWithRandomData() {
        int randomValue = new Random().nextInt(10);
        assertEquals(3, randomValue); // This will fail randomly
    }
    //Good Example
    @Test
    void testWithFixedInput() {
        int fixedValue = 5;
        assertEquals(5, fixedValue);
    }

    //Self-validating
    //A test should automatically tell you if it passes or fails (using assertions).
    //Bad Example
    @Test
    void testWithoutAssert() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        System.out.println(account.getBalance()); // No assert — just prints
    }
    //Good Example
    @Test
    void testDepositAmount() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    //Timely
    //Write your tests at the right time — ideally before the code, or at least while writing it.
    //We should use TDD(Test Driven Development)
}
