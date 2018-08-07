package pl.pjaskiewicz.udemy.cjm.sec9.lec90;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BranchTest {
    Branch gdansk = new Branch("Gdansk");
    Branch sopot = new Branch("Sopot");
    Branch gdynia = new Branch("Gdynia");

    Customer piotr = new Customer("Piotr");
    Customer dalia = new Customer("Dalia");
    Customer leon = new Customer("Leon");
    Customer jagoda = new Customer("Jagoda");

    @Test
    public void printListOfCustomers() {
        gdansk.addCustomerWithTransaction(piotr, 1000.0);
        gdansk.addTransactionToCustomer(piotr, 1500.0);
        gdansk.addCustomerWithTransaction(dalia, 2000.0);
        gdansk.addCustomerWithTransaction(leon, 3000.0);

        gdansk.printListOfCustomers();
    }

    @Test
    public void addCustomerWithTransaction() {
        assertTrue(gdansk.addCustomerWithTransaction(piotr, 1000.0));
        assertFalse(gdansk.addCustomerWithTransaction(piotr, 1000.0));
        assertTrue(gdansk.addCustomerWithTransaction(dalia, 2000.0));
    }

    @Test
    public void addTransactionToCustomer() {
        gdansk.addCustomerWithTransaction(piotr, 1000.0);
        gdansk.addTransactionToCustomer(piotr, 1000.0);
        gdansk.addTransactionToCustomer(piotr, 1500.0);
        gdansk.addTransactionToCustomer(piotr, 2000.0);

        gdansk.addCustomerWithTransaction(dalia, 2000.0);

        gdansk.addTransactionToCustomer(leon, 3000.0);

        gdansk.printListOfCustomers();

    }

    @Test
    public void findCustomer() {
        sopot.addCustomerWithTransaction(piotr, 1000.0);
        sopot.addCustomerWithTransaction(dalia, 2000.0);



        assertEquals("", -1, sopot.findCustomer("piotr"));
        assertEquals("", 0, sopot.findCustomer("Piotr"));
        assertEquals("", 1, sopot.findCustomer("Dalia"));
    }
}