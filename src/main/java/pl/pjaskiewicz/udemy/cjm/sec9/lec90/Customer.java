package pl.pjaskiewicz.udemy.cjm.sec9.lec90;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> listOfTransactions;

    public Customer(String name, ArrayList<Double> listOfTransactions) {
        this.name = name;
        this.listOfTransactions = listOfTransactions;
    }
}
