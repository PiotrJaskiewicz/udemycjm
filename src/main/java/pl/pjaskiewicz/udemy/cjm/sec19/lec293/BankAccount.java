package pl.pjaskiewicz.udemy.cjm.sec19.lec293;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    //The branch argument is true if the customer is performing the transaction
    //at a branch with a teller.
    //it's false if the customer is performing transaction at an ATM

    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    public double withdrawal(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
