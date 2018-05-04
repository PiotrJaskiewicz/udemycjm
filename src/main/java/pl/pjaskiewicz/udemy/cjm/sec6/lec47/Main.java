package pl.pjaskiewicz.udemy.cjm.sec6.lec47;

public class Main {
    public static void main(String[] args) {
        VipCustomer vipPerson1 = new VipCustomer();
        System.out.println(vipPerson1.getName());
        System.out.println(vipPerson1.getCreditLimit());
        System.out.println(vipPerson1.getEmailAddress());

        VipCustomer vipPerson2 = new VipCustomer("Piotr", "Piotr@dot.com");
        System.out.println(vipPerson2.getName());
        System.out.println(vipPerson2.getCreditLimit());
        System.out.println(vipPerson2.getEmailAddress());

    }
}
