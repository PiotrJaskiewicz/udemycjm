package pl.pjaskiewicz.udemy.cjm.sec6.lec38.MinutesToYearsDaysCalculator;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        System.out.println(5%2);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long YY = minutes / 60 / 24 / 365;

            long ZZ = (minutes % (60 * 24 * 365)) / (60 * 24);


            System.out.println(minutes + " min = " + YY + " y and " + ZZ + " d");
        }

    }
}
