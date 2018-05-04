package pl.pjaskiewicz.udemy.cjm.sec6.lec46;

public class Main {
    public static void main(String[] args) {

        BankAccount piotrAccount = new BankAccount("xsxsxsx", 123);
        System.out.println(piotrAccount.getEmail());
        piotrAccount.setBalance(1000);

        piotrAccount.depositFunds(550);


        piotrAccount.withdrawFunds(1500);


        piotrAccount.withdrawFunds(1500);
    }


}
