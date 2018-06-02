package pl.pjaskiewicz.udemy.cjm.sec8.lec67.TB;

import pl.pjaskiewicz.udemy.cjm.utils.Utils;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {
        Utils.example();

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();

        System.out.println("*******");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        System.out.println("*** *** ***");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        //healthyBurger.addHamburgerAddition2();
       // healthyBurger.addHamburgerAddition3();
        //healthyBurger.addHamburgerAddition4();
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
       // healthyBurger.addHealthyAddition2();
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());
        System.out.println("*** *** ***");

        DeLuxeBurger deLuxeBurger = new DeLuxeBurger();
        deLuxeBurger.itemizeHamburger();
        deLuxeBurger.addHamburgerAddition4("csdcsd", 5);





    }
}
