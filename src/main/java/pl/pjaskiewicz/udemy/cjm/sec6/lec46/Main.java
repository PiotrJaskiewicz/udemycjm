package pl.pjaskiewicz.udemy.cjm.sec6.lec46;

public class Main {
    public static void main(String[] args) {

        BankAccount piotrAccount = new BankAccount();
        piotrAccount.setBalance(1000);
        System.out.println(piotrAccount.getBalance() + "PLN");

        piotrAccount.depositFunds(550);
        System.out.println(piotrAccount.getBalance() + "PLN");

        piotrAccount.withdrawFunds(1500);
        System.out.println(piotrAccount.getBalance() + "PLN");

        piotrAccount.withdrawFunds(1500);
        System.out.println(piotrAccount.getBalance() + "PLN");
    }


}
