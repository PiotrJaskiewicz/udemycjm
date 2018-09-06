package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(2));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;

        } else {

            int remainder = 1;
            int temp = number;
            int sumOfEvenNumbers = 0;

            while (temp > 0) {

                remainder = temp % 10;
                temp = temp / 10;

                if (remainder % 2 == 0) {
                    sumOfEvenNumbers += remainder;
                }
            }
            return sumOfEvenNumbers;
        }
    }
}
