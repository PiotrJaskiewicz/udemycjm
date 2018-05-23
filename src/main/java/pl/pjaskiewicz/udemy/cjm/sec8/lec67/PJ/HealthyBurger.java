package pl.pjaskiewicz.udemy.cjm.sec8.lec67.PJ;

public class HealthyBurger extends BaseBurger {

    public HealthyBurger(String rollType, boolean isMeat, double basePrice) {
        super(rollType, isMeat, basePrice);
    }

    Addition lettuce = new Addition("lettuce", 1, 1);
    Addition tomato = new Addition("tomato", 1.5, 1);
    Addition cucumber = new Addition("cucumber", 1.5, 0);
    Addition onion = new Addition("onion", 0.5, 0);
    Addition bacon = new Addition("bacon", 2, 0);
    //Addition avocado = new Addition("avocado", 3, 1);
    //Addition pineNut = new Addition("pine nut", 4.5, 1);
    //Addition shrimps = new Addition("shrimps", 6, 1 );

    @Override
    public void printAdditions() {
        super.printAdditions();
        System.out.println("Extra additions: " +
                lettuce.printNameIfQuantityPositive() +
                tomato.printNameIfQuantityPositive() +
                cucumber.printNameIfQuantityPositive() +
                onion.printNameIfQuantityPositive() +
                bacon.printNameIfQuantityPositive());
    }

    @Override
    public double totalAdditionPrice() {

        if ((lettuce.getQuantity() + super.lettuce.getQuantity() +
                tomato.getQuantity() + super.tomato.getQuantity() +
                cucumber.getQuantity() + super.cucumber.getQuantity() +
                onion.getQuantity() + super.onion.getQuantity() +
                bacon.getQuantity() + super.bacon.getQuantity() <= 6)) {
            return  lettuce.additionPrice() + super.lettuce.additionPrice() +
                    tomato.additionPrice() + super.tomato.additionPrice() +
                    cucumber.additionPrice() + super.cucumber.additionPrice() +
                    onion.additionPrice() + super.onion.additionPrice() +
                    bacon.additionPrice() + super.bacon.additionPrice();
        } else {
            return -1;
        }
    }

    @Override
    public double totalBurgerPrice() {

        if (totalAdditionPrice() == -1) {
            System.out.println("Too much additions. Max. 6 allowed.");
            return -1;
        }
         else {
            return super.getBasePrice() + totalAdditionPrice();
        }

    }
    @Override
    public void burgerPriceSummary() {
        super.burgerPriceSummary();
        //System.out.println("Base burger price = " + super.getBasePrice() + " $");
        //printAdditions();
        //System.out.println("Total additions price = " + totalAdditionPrice() + " $");
        //System.out.println("Total healthy burger price = " + totalBurgerPrice() + " $");

    }
}
