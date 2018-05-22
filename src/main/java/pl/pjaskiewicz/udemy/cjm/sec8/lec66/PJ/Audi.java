package pl.pjaskiewicz.udemy.cjm.sec8.lec66.PJ;

public class Audi extends Car{

    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Class Audi: start engine with typical Audi system");;
    }
}
