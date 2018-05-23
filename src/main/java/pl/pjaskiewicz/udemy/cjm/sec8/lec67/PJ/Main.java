package pl.pjaskiewicz.udemy.cjm.sec8.lec67.PJ;

public class Main {
    public static void main(String[] args) {

        BaseBurger baseBurger = new BaseBurger("Bread", true, 6);
        System.out.println(baseBurger.totalBaseBurgerPrice());
        System.out.println("*************");

        HealthyBurger healthyBurger = new HealthyBurger("Brown rye bread", true, 8);

        System.out.println(healthyBurger.totalHealthBurgerPrice());




    }
}

