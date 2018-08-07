package pl.pjaskiewicz.udemy.cjm.sec9.lec90;

import javax.sound.midi.Soundbank;
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
    //// +Add a new branch
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
                    System.out.println("\nChoose your action (7 for instructions):");
                    break;
                case 2:
                    addBranchToBank();
                    System.out.println("\nChoose your action (7 for instructions):");
                    break;
                case 3:
                    printListOfCustomers();
                    System.out.println("\nChoose your action (7 for instructions):");
                    break;
                case 4:
                    addCustomerToBranch();
                    System.out.println("\nChoose your action (7 for instructions):");
                    break;
                case 5:
                    addTransactionToCustomer();
                    System.out.println("\nChoose your action (7 for instructions):");
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

        if (bank.getListOfBranches().size() == 0) {
            System.out.println("There is no branches on the list.");
        } else {
            System.out.println("List of branches:");
            for (int i = 0; i < bank.getListOfBranches().size(); i++) {
                System.out.println((i + 1) + ". " +
                        bank.getListOfBranches().get(i).getName());
            }
        }
    }

    private static void addBranchToBank() {
        System.out.print("Type a name of new branch: ");
        scanner.nextLine(); //musialem to wpisac aby scanner odczytywal. why?
        String branchName = scanner.nextLine();
        Branch branch = new Branch(branchName);
        bank.addBranch(branch);
    }

    public static void printListOfCustomers() {
        printAvailableBranches();

        System.out.println("\nEnter the name of the branch for which you want to check customers");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        int branchPosition = bank.findBranch(branchName);
        if (branchPosition == -1) {
            System.out.println("There is no branch " + branchName + " in database");
        } else {

            System.out.println("List of customers for branch " + branchName + ":");
            bank.getListOfBranches().get(branchPosition).printListOfCustomers();

        }
    }

    private static void addCustomerToBranch() {
        printAvailableBranches();

        System.out.println("\nEnter the name of the branch for which you want to add customer");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        int branchPosition = bank.findBranch(branchName);
        if (branchPosition == -1) {
            System.out.println("There is no branch " + branchName + " in database.");
        } else {

            System.out.println("Enter the name of the customer you want to add: ");
            //scanner.nextLine();
            String customerName = scanner.nextLine();
            Customer newCustomer = new Customer(customerName);

            System.out.println("Enter transaction to above customer: ");
            //scanner.nextLine();
            double transaction = scanner.nextDouble();

            if (bank.getListOfBranches().get(branchPosition).addCustomerWithTransaction(newCustomer, transaction)) {
                System.out.println("Customer " + customerName +
                        " with initial transaction " + transaction +
                        " added to " + branchName + ".");
            } else {
                System.out.println("Customer " + customerName + " is already on database");
            }
        }
    }

    private static void addTransactionToCustomer() {
        printAvailableBranches();
        System.out.println("\nEnter the name of the branch for which you want to add customers");
        scanner.nextLine(); //sprawdzic
        String branchName = scanner.nextLine();
        int branchPosition = bank.findBranch(branchName);
        if (branchPosition == -1) {
            System.out.println("There is no branch " + branchName + " in database.");
        } else {

            System.out.println("Enter the name of the customer for which you want to add transaction: ");
            String customerName = scanner.nextLine();


            System.out.println("Enter transaction to above customer: ");
            double transaction = scanner.nextDouble();

            int customerPosition = bank.getListOfBranches().get(branchPosition).findCustomer(customerName);

            Customer customer = bank.getListOfBranches().get(branchPosition).getListOfCustomers().get(customerPosition);

            bank.getListOfBranches().get(branchPosition).addTransactionToCustomer(customer, transaction);

        }
    }

    private static void printActions() {
        System.out.println("\n Available actions, press: ");
        System.out.println("0 - to shut down\n" +
                "1 - to print list of branches\n" +
                "2 - to add branch\n" +
                "3 - to print list of customers with transactions for particular branch\n" +
                "4 - to add customer to branch\n" +
                "5 - to add transaction to customer\n" +
                "6 - to xxxxxxxxxxx\n" +
                "7 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    private static void printAvailableBranches() {
        System.out.println("List of available branches:");
        if (bank.getListOfBranches().size() == 0) {
            System.out.println("There is no branches for " + bank.getName() + " bank.");
        } else {
            for (int i = 0; i < bank.getListOfBranches().size(); i++) {
                System.out.print((i + 1) + ". " +
                        bank.getListOfBranches().get(i).getName() + ", ");
            }
        }
    }
}
