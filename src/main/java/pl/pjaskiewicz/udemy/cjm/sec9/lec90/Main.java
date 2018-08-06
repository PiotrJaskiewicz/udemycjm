package pl.pjaskiewicz.udemy.cjm.sec9.lec90;

import java.util.Scanner;

public class Main {

    // Your job is to create a simple banking application.
    // +There should be a Bank class
    // +It should have an arraylist of Branches
    // +Each Branch should have an arraylist of Customers
    // +The Customer class should have an arraylist of Doubles (transactions)
    // +Customer:
    // +Name, and the ArrayList of doubles.
    // +Branch:
    // +Need to be able to add a new customer and initial transaction amount.
    // +Also needs to add additional transactions for that customer/branch
    // +Bank:
    // +Add a new branch
    // +Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch

    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("ING");

    public static void main(String[] args) {
      
        boolean quit = false;
        startBankApp();
        printActions();

        while (!quit) {

            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Shutting down...\nSee you next time");
                    quit = true;
                    break;
                case 1:
                    printListOfBranches();
                    System.out.println("Choose your action:");
                    break;
                case 2:
                    addBranchToBank();
                    System.out.println("Choose your action:");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    printActions();
                    break;
            }

        }


    }

    private static void startBankApp() {
        System.out.println("Welcome to brand new Bank App for ING.\n" + "Starting app...");
    }

    private static void printListOfBranches() {
        System.out.println("List of branches:");
        for (int i = 0; i < bank.getListOfBranches().size(); i++) {
            System.out.println((i + 1) + ". " +
                    bank.getListOfBranches().get(i).getName());
        }
    }

    private static void addBranchToBank() {
        System.out.println("Type a name of new branch");
        scanner.nextLine(); //musialem to wpisac aby scanner odczytywal. why?
        String branchName = scanner.nextLine();
        Branch branch = new Branch(branchName);
        bank.addBranch(branch);




    }

    private static void printListOfCustomers(Branch branch) {

    }

    private static void printActions() {
        System.out.println("\n Available actions, press: ");
        System.out.println("0 - to shut down\n" +
                "1 - to print list of branches\n" +
                "2 - to add branch\n" +
                "3 - to print list of customers for particular branch\n" +
                "4 - to add customer to branch\n" +
                "5 - to add transaction to customer\n" +
                "6 - to \n" +
                "7 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
