package pl.pjaskiewicz.udemy.cjm.sec9.lec90.PJ;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> listOfTransactions;

    public Customer(String name) {
        this.name = name;
        this.listOfTransactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public ArrayList<Double> getListOfTransactions() {
        return listOfTransactions;
    }


}
