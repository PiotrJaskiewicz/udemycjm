package pl.pjaskiewicz.udemy.cjm.sec8.lec66.PJ;

public class BMW extends Car {
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Class BMW: accelerating with support systems");;
    }
}
