package pl.pjaskiewicz.udemy.cjm.sec9.lec90;

import java.util.ArrayList;

public class Branch {
    private int number;
    private ArrayList<Customer> listOfCustomers = new ArrayList<>();

    public void addCustomer(Customer customer){
        listOfCustomers.add(customer);

    }
}
