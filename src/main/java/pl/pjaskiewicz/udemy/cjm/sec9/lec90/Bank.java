package pl.pjaskiewicz.udemy.cjm.sec9.lec90;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> listOfBranches;

    public Bank(String name) {
        this.name = name;
        this.listOfBranches = new ArrayList<>();
    }

    public boolean addBranch(Branch branch) {
        if (findBranch(branch.getName()) >= 0) {
            System.out.println("Branch " + branch.getName() + "is already in data base");
            return false;
        }
        listOfBranches.add(branch);
        return true;
    }

    private int findBranch(String branchName) {
        //zwraca pozycje brancha. jak nie ma to -1
        for (int i = 0; i < listOfBranches.size(); i++) {
            Branch branch = listOfBranches.get(i);
            if (branch.getName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    private int findCustomerInBranch(String customerName, Branch branch) {
        //szuka nazwy brancha i zwraca pozycję na liście
        if(findBranch(branch.getName())>=0){
            
        }

        for (int i = 0; i < listOfBranches.get(); i++) {
            Customer customer = listOfCustomers.get(i);
            if (customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    private boolean addCustomerWithTransactionToBranch(Branch branch, Customer customer, Double transaction) {
        if ()

            branch.addCustomerWithTransaction(customer, transaction);
        listOfBranches.add(branch);
        return true;
    }
}
