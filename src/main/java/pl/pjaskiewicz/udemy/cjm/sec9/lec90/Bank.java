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

    public int findBranch(String branchName) {
        //zwraca pozycje brancha. jak nie ma to -1
        for (int i = 0; i < listOfBranches.size(); i++) {
            Branch branch = listOfBranches.get(i);
            if (branch.getName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public int findCustomerInBranch(Customer customer, Branch branch) {
        //szuka nazwy brancha i zwraca pozycję na liście
        //szuka klienta na w tym branchu, jak nie ma to -1
        if (findBranch(branch.getName()) >= 0) {
            if (branch.findCustomer(customer.getName()) >= 0) {
                System.out.println("Customer " + customer.getName() + " is in branch " + branch.getName());
                return branch.findCustomer(customer.getName());
            }else{
                System.out.println("Customer " + customer.getName() + " is not in branch " + branch.getName());
                return -1;
            }
        }
        System.out.println("The branch " + branch.getName() + " is not in the database");
        return -2;
    }

    private boolean addCustomerWithTransactionToBranch(Branch branch, Customer customer, Double transaction) {
        if(findCustomerInBranch(customer, branch)>=0){
            System.out.println("Customer " + customer.getName() + " already exists in branch " + branch.getName());
            return false;
        }else if(findCustomerInBranch(customer, branch) == -1){
            branch.addCustomerWithTransaction(customer, transaction);
            System.out.println("Customer " + customer.getName() + " was successfully added to branch " + branch.getName());
            return true;
        }
        System.out.println("Branch " + branch.getName() + " is not in database");
        return false;



    }

}
