package pl.pjaskiewicz.udemy.cjm.sec8.lec67.PJ;

public class HealthyBurger extends BaseBurger {

    public HealthyBurger(String rollType, boolean isMeat, double basePrice) {
        super(rollType, isMeat, basePrice);
    }

    Addition avocado = new Addition("avocado", 3, 1);
    Addition pineNut = new Addition("pine nut", 4.5, 1);
    Addition shrimps = new Addition("shrimps", 6, 1 );

    @Override
    public void printAdditions() {
        super.printAdditions();
        System.out.println(avocado.printNameIfQuantityPositive() +
                pineNut.printNameIfQuantityPositive() + shrimps.printNameIfQuantityPositive());
    }

    public double totalHealthBurgerPrice() {

        if ((avocado.getQuantity() + pineNut.getQuantity() + shrimps.getQuantity()) <= 2) {
            double totalAdditionsPrice = avocado.getPrice() * avocado.getQuantity() +
                    pineNut.getPrice() * pineNut.getQuantity() +
                    shrimps.getPrice() * shrimps.getQuantity();

            System.out.println("Total price of healthy burger with additions equal to");

            return totalAdditionsPrice + totalBaseBurgerPrice();
        } else {
            System.out.println("Too much additions for healthy burger. Please choose up to 2.");
            return -1;
        }

    }


}
