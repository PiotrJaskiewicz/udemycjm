package pl.pjaskiewicz.udemy.cjm.sec8.lec66.PJ;

public class Main {
    public static void main(String[] args) {

        for(int i = 1; i<5; i++){
            Car car = randomCar();
            System.out.println("Model: " +  car.getName() +
                    ", cylinders number: " + car.getCylinders() +
                    ", wheels number: " + car.getWheels() +
                    ", contains engine: " + car.isEngine() + "\n");
        }


    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Audi("A6", 6);
            case 2:
                return new BMW("M6", 4);
            case 3:
                return new Mercedes("AMG GT", 12);
        }
        return null;
    }
}
