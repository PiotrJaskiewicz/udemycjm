package pl.pjaskiewicz.udemy.cjm.sec9.lec90;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    Bank bank = new Bank("ING");

    Branch alfa = new Branch("alfa");
    Branch bravo = new Branch("bravo");
    Branch charlie = new Branch("charlie");
    Branch delta = new Branch("delta");
    Branch echo = new Branch("echo");


    @Test
    public void findBranch() {

        bank.addBranch(alfa);
        bank.addBranch(bravo);
        bank.addBranch(charlie);
        bank.addBranch(delta);



        assertEquals("Wrong position of the branch on the list",0, bank.findBranch("alfa"));
        assertEquals("Wrong position of the branch on the list",1, bank.findBranch("bravo"));
        assertEquals("Wrong position of the branch on the list",2, bank.findBranch("charlie"));
        assertEquals("Wrong position of the branch on the list",3, bank.findBranch("delta"));

        assertEquals("branch is not in database",-1, bank.findBranch("echo"));

    }

    @Test
    public void findCustomerInBranch() {

        bank.addBranch(alfa);
        bank.addBranch(bravo);
        bank.addBranch(charlie);
        bank.addBranch(delta);

        Customer piotr = new Customer("Piotr");
        Customer dalia = new Customer("Dalia");
        Customer jagoda = new Customer("Jagoda");
        Customer leon = new Customer("Leon");
        Customer hryna = new Customer("Hryna");
        Customer iza = new Customer("Iza");
        Customer mary = new Customer("Mary");


        alfa.addCustomerWithTransaction(piotr, 1000.0);
        alfa.addCustomerWithTransaction(dalia, 2000.0);
        alfa.addCustomerWithTransaction(jagoda, 2000.0);
        alfa.addCustomerWithTransaction(leon, 1000.0);

        bravo.addCustomerWithTransaction(hryna,5000.0);
        bravo.addCustomerWithTransaction(iza,6000.0);
        bravo.addCustomerWithTransaction(mary, 7000.0);


        assertEquals("Wrong position of the branch on the list",0,bank.findCustomerInBranch(piotr,alfa) );
        assertEquals("Wrong position of the branch on the list",1,bank.findCustomerInBranch(dalia,alfa) );
        assertEquals("Wrong position of the branch on the list",2,bank.findCustomerInBranch(jagoda,alfa) );
        assertEquals("Wrong position of the branch on the list",3,bank.findCustomerInBranch(leon,alfa) );

        assertEquals("Customer not in the branch",-1,bank.findCustomerInBranch(piotr,bravo) );

        assertEquals("No branch in data base",-2,bank.findCustomerInBranch(piotr,echo) );

    }
}