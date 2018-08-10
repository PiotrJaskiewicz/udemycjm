package pl.pjaskiewicz.udemy.cjm.sec9.lec90.PJ;

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

    public void printListOfCustomers() {
        for (int i = 0; i < this.listOfCustomers.size(); i++) {
            System.out.println((i + 1) + ". " + this.listOfCustomers.get(i).getName());

            for (int j = 0; j < this.listOfCustomers.get(i).getListOfTransactions().size(); j++) {
                System.out.println("\t" + (j + 1) + ". " + this.listOfCustomers.get(i).getListOfTransactions().get(j));
            }
        }
    }


    public boolean addCustomerWithTransaction(Customer customer, Double transaction) {
        //sprawdza czy customer juz istnieje na liscie klientów. tak->return int>=0, nie -> return int =-1
        if (findCustomer(customer.getName()) >= 0) {
            return false;
        }
        listOfCustomers.add(customer);
        customer.getListOfTransactions().add(transaction);
        return true;

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
