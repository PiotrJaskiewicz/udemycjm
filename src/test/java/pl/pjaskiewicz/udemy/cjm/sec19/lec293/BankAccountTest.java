package pl.pjaskiewicz.udemy.cjm.sec19.lec293;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {


    @Test
    public void deposit() {
        BankAccount account = new BankAccount("Piotr", "Jaskiewicz", 1000);
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);

    }

    @Test
    public void withdrawal() {
        fail("This test has yet to be implemented");
    }

    @Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Piotr", "Jaskiewicz", 1000);
        account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Piotr", "Jaskiewicz", 1000);
        account.withdraw(200, true);
        assertEquals(800, account.getBalance(), 0);
    }

}