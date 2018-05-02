package pl.pjaskiewicz.udemy.cjm.sec5.lec34;

public class Main {
    public static void main(String[] args) {
        checkNumber(-50);
        checkNumber(0);
        checkNumber(10);
        System.out.println("**********************");

        printMegaBytesAndKiloBytes(2048);

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

}
