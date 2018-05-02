package pl.pjaskiewicz.udemy.cjm.sec5.lec34;

public class Main {
    public static void main(String[] args) {
        checkNumber(-50);
        checkNumber(0);
        checkNumber(10);
        System.out.println("**********************");

        printMegaBytesAndKiloBytes(2048);
        System.out.println("**********************");

        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
        System.out.println(bark(true, 24));
        System.out.println("**********************");

        System.out.println("-1600 " + isLeapYear(-1600));
        System.out.println("10000 " + isLeapYear(10000));
        System.out.println("1600 " + isLeapYear(1600));
        System.out.println("2017 " + isLeapYear(2017));
        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2100 " + isLeapYear(2100));
        System.out.println("2008 " + isLeapYear(2008));


    }

    public static void checkNumber(int number) {
        if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        } else
            System.out.println("positive");
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remaider = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaider + " KB");

        }
    }

    public static boolean bark(boolean barking, int hourOfday) {
        if (hourOfday < 0 && hourOfday > 23) {
            return false;
        } else if (barking && (((hourOfday >= 0) && (hourOfday < 8)) || ((hourOfday > 22) && (hourOfday <= 23)))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


}
