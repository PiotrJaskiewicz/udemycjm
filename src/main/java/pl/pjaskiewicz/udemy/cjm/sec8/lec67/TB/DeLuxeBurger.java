package pl.pjaskiewicz.udemy.cjm.sec8.lec67.TB;

public class DeLuxeBurger extends Hamburger {
    public DeLuxeBurger() {
        super("DeLuxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75); //dlaczego te metody mozna wywolac tylko w konstruktorze?
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }
}
