package pl.pjaskiewicz.udemy.cjm.sec5.lec34.CodingExercises.DecimalComparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.123,1));
        System.out.println(areEqualByThreeDecimalPlaces(1.001,1));

        System.out.println(1.001*1000);
        //dlaczego nie 1.001*1000 daje 1000.99999999
    }

    public static boolean areEqualByThreeDecimalPlaces(double parameter1, double parameter2){
        int number1 = (int)(parameter1*1000);
        int number2 = (int)(parameter2*1000);

        if (number1 == number2){
            return true;

        }else
            return false;
    }
}
