package pl.pjaskiewicz.udemy.cjm.sec8.lec67.PJ;

public class BaseBurger {
    private String name;
    private String rollType;
    private boolean isMeat;
    private double basePrice;

    public BaseBurger(String rollType, boolean isMeat, double basePrice) {
        this.name = "Base Burger";
        this.rollType = rollType;
        this.isMeat = isMeat;
        this.basePrice = basePrice;
    }

    Addition lettuce = new Addition("lettuce", 1, 3);
    Addition tomato = new Addition("tomato", 1.5, 0);
    Addition cucumber = new Addition("cucumber", 1.5, 0);
    Addition onion = new Addition("onion", 0.5, 0);
    Addition bacon = new Addition("bacon", 2, 1);

    public void printAdditions() {
        System.out.println("Base additions: " +
                lettuce.printNameIfQuantityPositive() +
                tomato.printNameIfQuantityPositive() +
                cucumber.printNameIfQuantityPositive() +
                onion.printNameIfQuantityPositive() +
                bacon.printNameIfQuantityPositive());
    }


    public double totalAdditionPrice() {
        if ((lettuce.getQuantity() +
                tomato.getQuantity() +
                cucumber.getQuantity() +
                onion.getQuantity() +
                bacon.getQuantity() <= 4)) {
            return lettuce.additionPrice() +
                    tomato.additionPrice() +
                    cucumber.additionPrice() +
                    onion.additionPrice() +
                    bacon.additionPrice();
        } else {
            return -1;
        }
    }

    public double totalBurgerPrice() {

        if (totalAdditionPrice() == -1) {
            System.out.println("Too much base additions. Max. 4 allowed.");
            return -1;
        } else
            return basePrice + totalAdditionPrice();
    }

    public void burgerPriceSummary() {
        System.out.println("Base burger price = " + basePrice + " $");
        printAdditions();
        System.out.println("Total addition price = " + totalAdditionPrice() + " $");
        System.out.println("Total base burger price = " + totalBurgerPrice() + " $");

    }


    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
