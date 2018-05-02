package pl.pjaskiewicz.udemy.cjm.sec6.lec34;

public class Main {
    public static void main(String[] args) {
        System.out.println("10000PLN at 2% interest = " + calculateInterest(10000, 2) + "PLN");

        for (int i = 2; i < 9; i++) {
            System.out.println("Amount 10000PLN at " + i + "% interest rate equals " + calculateInterest(10000, i));
        }
        double interestRate = 1;

        for (int i = 0; i < 7; i++) {
            interestRate = interestRate + 1;
            System.out.println("Amount 10000PLN at " + i + "% interest rate equals " + calculateInterest(10000, interestRate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
