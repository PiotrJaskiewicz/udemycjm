package pl.pjaskiewicz.udemy.cjm.sec8.lec67.PJ;

public class Main {
    public static void main(String[] args) {

        BaseBurger baseBurger = new BaseBurger("Bread", true, 6);
        baseBurger.burgerPriceSummary();
        System.out.println("*** *** ***");

        HealthyBurger healthyBurger = new HealthyBurger("Brown rye bread", true, 8);
        healthyBurger.burgerPriceSummary();
        System.out.println("*** *** ***");

        DeLuxBurger deLuxBurger = new DeLuxBurger("Grain Bread", true, 10);
        deLuxBurger.burgerPriceSummary();


    }
}

