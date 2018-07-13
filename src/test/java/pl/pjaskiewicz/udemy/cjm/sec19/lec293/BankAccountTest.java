package pl.pjaskiewicz.udemy.cjm.sec19.lec293;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {


    @Test
    public void deposit() {
        BankAccount account = new BankAccount("Piotr", "Jaskiewicz", 1000, BankAccount.CHECKING);
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);

    }

    @Test
    public void withdrawal() {
        BankAccount account = new BankAccount("Piotr", "Jaskiewicz", 1000, BankAccount.CHECKING);
        assertEquals(0, account.withdraw(1000, false),0);
    }

    @Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Piotr", "Jaskiewicz", 1000, BankAccount.CHECKING);
        account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Piotr", "Jaskiewicz", 1000, BankAccount.CHECKING);
        account.withdraw(200, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Piotr", "Jaskiewicz", 1000, BankAccount.CHECKING);
        assertTrue( "The account is NOT a checking account",account.isChecking());
    }
}