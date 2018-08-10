package pl.pjaskiewicz.udemy.cjm.sec9.lec90.TB;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransactions(initialAmount);
        //czy mogloby tu byc od razu:
        //this.transaction.add(initialAmount);
        //chyba nie potrzebna osobna metoda?
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
