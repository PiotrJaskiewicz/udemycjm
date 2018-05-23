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

    Addition lettuce = new Addition("lettuce", 1, 2);
    Addition tomato = new Addition("tomato", 1.5, 1);
    Addition cucumber = new Addition("cucumber", 1.5, 1);
    Addition onion = new Addition("onion", 0.5, 0);
    Addition bacon = new Addition("bacon", 2, 1);

    public void printAdditions() {
        System.out.println("Chosen additions: " + "\n" +
                lettuce.printNameIfQuantityPositive() +
                tomato.printNameIfQuantityPositive() +
                cucumber.printNameIfQuantityPositive() +
                onion.printNameIfQuantityPositive() +
                bacon.printNameIfQuantityPositive());
    }


    public double totalBaseBurgerPrice() {
        printAdditions();
        if ((lettuce.getQuantity() + tomato.getQuantity() + cucumber.getQuantity() + onion.getQuantity() + bacon.getQuantity()) <= 4) {
            double totalAdditionsPrice = lettuce.getPrice() * lettuce.getQuantity() +
                    tomato.getPrice() * tomato.getQuantity() +
                    cucumber.getPrice() * cucumber.getQuantity() +
                    onion.getPrice() * onion.getQuantity() +
                    bacon.getPrice() * bacon.getQuantity();

            System.out.println("Total price of base burger with additions equal to");

            return totalAdditionsPrice + basePrice;
        } else {
            System.out.println("Too much additions for base burger. Please choose up to 4.");
            return -1;
        }
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
