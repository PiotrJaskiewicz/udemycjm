package pl.pjaskiewicz.udemy.cjm.sec9.lec90.TB;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank=");

        bank.addBranch("Adelaide");
        bank.addCustomers("Adelaide", "Tim", 50.05);
        bank.addCustomers("Adelaide", "Mike", 175.34);
        bank.addCustomers("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomers("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", false);
        bank.listCustomers("Adelaide", true);

        bank.listCustomers("Sydney", true);

        //sprawdzenie czy jezeli nie ma odziału to wyskoczy false

        if (!bank.addCustomers("Melbourne", "Brian", 5.53)) {
            System.out.println("Error. Melbourne branch does not exist.");
        }

        bank.addBranch("Melbourne");
        if (!bank.addCustomers("Melbourne", "Brian", 5.53)) {
            System.out.println("Error. Melbourne branch does not exist.");
        } else {
            System.out.println("success");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Already exist");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist in a branch");
        }
        if (!bank.addCustomers("Adelaide", "Tim", 55)){
            System.out.println("Already exist");
        }
    }
}
