package pl.pjaskiewicz.udemy.cjm.sec5.lec34;

public class Main {
    public static void main(String[] args) {
        checkNumber(-50);
        checkNumber(0);
        checkNumber(10);

    }

    public static void checkNumber(int number) {
        if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        } else
            System.out.println("positive");
    }
}
