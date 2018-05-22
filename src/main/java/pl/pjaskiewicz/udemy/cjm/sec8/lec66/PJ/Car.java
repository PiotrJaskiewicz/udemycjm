package pl.pjaskiewicz.udemy.cjm.sec8.lec66.PJ;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

   public Car(String name, int cylinders){
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("Class Car: startEngine");
    }

    public void accelerate(){
        System.out.println("Class Car: accelerate");
    }

    public void brake(){
        System.out.println("Class Car: brake");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
