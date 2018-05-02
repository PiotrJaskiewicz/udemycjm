package pl.pjaskiewicz.udemy.cjm.sec6.lec34;

public class Main {
    public static void main(String[] args) {


        for (int i = 2; i < 9; i++) {
            System.out.println("10000PLN at " + i + "% interest = " + String.format("%.1f", calculateInterest(10000, i)) + "PLN");
        }

        System.out.println("****************");
        
        for (int i = 8; i > 1; i--) {
            System.out.println("10000PLN at " + i + "% interest = " + String.format("%.1f", calculateInterest(10000, i)) + "PLN");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
