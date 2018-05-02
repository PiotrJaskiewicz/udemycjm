package pl.pjaskiewicz.udemy.cjm.sec6.lec34;

public class Main {
    public static void main(String[] args) {
        System.out.println("10000PLN at 2% interest = " + calculateInterest(10000, 2) + "PLN");

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
