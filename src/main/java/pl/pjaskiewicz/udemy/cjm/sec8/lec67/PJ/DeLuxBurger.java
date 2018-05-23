package pl.pjaskiewicz.udemy.cjm.sec8.lec67.PJ;

public class DeLuxBurger extends BaseBurger {
    public DeLuxBurger(String rollType, boolean isMeat, double basePrice) {
        super(rollType, isMeat, basePrice);
    }

    Addition cola = new Addition("cola", 1, 1);
    Addition fanta = new Addition("fanta", 1, 0);
    Addition water = new Addition("water", 1, 0);

    Addition chips = new Addition("chips", 2, 0);
    Addition longChips = new Addition("longChips", 2, 1);
    Addition wavyChips = new Addition("wavyChips", 2, 0);


    @Override
    public void printAdditions() {
        super.printAdditions();
        System.out.println("Chips & softs: " +
                cola.printNameIfQuantityPositive() +
                fanta.printNameIfQuantityPositive() +
                water.printNameIfQuantityPositive() +
                chips.printNameIfQuantityPositive() +
                longChips.printNameIfQuantityPositive() +
                wavyChips.printNameIfQuantityPositive());
    }

    @Override
    public double totalAdditionPrice() {
        if (super.totalAdditionPrice() == -1) {
            return -1;
        }
        if (cola.getQuantity() + fanta.getQuantity() + water.getQuantity() +
                chips.getQuantity() + longChips.getQuantity() + wavyChips.getQuantity() > 2) {
            return -1;
        } else {
            return super.totalAdditionPrice() +
                    cola.additionPrice() + fanta.additionPrice() + water.additionPrice() +
                    chips.additionPrice() + longChips.additionPrice() + wavyChips.additionPrice();
        }
    }

    @Override
    public double totalBurgerPrice() {
        if (totalAdditionPrice() == -1) {
            System.out.println("Too much additions. Max. 6 allowed.");
            return -1;
        } else {
            return super.getBasePrice() + totalAdditionPrice();
        }
    }

    @Override
    public void burgerPriceSummary() {
        super.burgerPriceSummary();
    }
}
