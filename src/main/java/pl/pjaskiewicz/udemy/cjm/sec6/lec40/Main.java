package pl.pjaskiewicz.udemy.cjm.sec6.lec40;

public class Main {
    public static void main(String[] args) {
        SumOddRange number = new SumOddRange();

        for (int i = 0; i < 10; i++) {
            System.out.println("Is number " + i + " odd? " + number.isOdd(i));
        }

        System.out.println(number.sumOdd(1,100));
        System.out.println(number.sumOdd(-1,100));
        System.out.println(number.sumOdd(100,100));
        System.out.println(number.sumOdd(100,-100));
        System.out.println(number.sumOdd(100,1000));
    }


}
