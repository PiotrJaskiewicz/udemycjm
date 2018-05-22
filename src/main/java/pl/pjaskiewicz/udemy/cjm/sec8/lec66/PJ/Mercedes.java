package pl.pjaskiewicz.udemy.cjm.sec8.lec66.PJ;

public class Mercedes extends Car{

    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void brake() {
        System.out.println("class Mercedes: brake ultimately with Merc ice-feature");;
    }
}
