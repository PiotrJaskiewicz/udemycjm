package pl.pjaskiewicz.udemy.cjm.sec9.lec90;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> listOfCustomers;// = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
        this.listOfCustomers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }


    public boolean addCustomerWithTransaction(Customer customer, Double transaction) {
        //sprawdza czy customer juz istnieje na liscie klientów. tak->return int>=0, nie -> return int =-1
        if (findCustomer(customer.getName()) >= 1) {
            System.out.println("Customer " + customer.getName() + "is already on database");
            return false;
        }
        listOfCustomers.add(customer);
        customer.getListOfTransactions().add(transaction);
        return true;

    }

    public void addTransactionToCustomer(Customer customer, Double transaction) {
        if (findCustomer(customer.getName()) >= 1) {
            customer.getListOfTransactions().add(transaction);
            System.out.println("Transaction " + transaction + " added to " + customer.getName());
        } else {
            //jezeli nie ma takiego klienta to zostanie utworzony
            addCustomerWithTransaction(customer, transaction);
            System.out.println("Customer " + customer +
                    " added to database with transaction " + transaction + ".");
        }
    }

    public int findCustomer(String customerName) {
        //jezeli nazwa klienta zostanie znaleziona w bazie to zwroci jego pozycję na liście
        //jeżeli nie to zwróci -1
        for (int i = 0; i < listOfCustomers.size(); i++) {
            Customer customer = listOfCustomers.get(i);
            if (customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

}
