package pl.pjaskiewicz.udemy.cjm.sec6.lec34;

public class Main {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void main(String[] args) {
        double amount = 1000;//PLN
        double interestRate = 2; //%
        System.out.println("Amount equal to: " + amount + "PLN");
        System.out.println("Interest rate equal to: " + interestRate + "%");
        System.out.println("Interest rate equal to: " + calculateInterest(amount, interestRate) + "PLN");
    }

}
