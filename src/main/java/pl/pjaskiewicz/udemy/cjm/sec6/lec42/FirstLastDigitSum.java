package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0 || number > 2147483647) {
            return -1;
        } else if (number < 10) {
            return 2 * number;
        } else {
            int lastDigit = number % 10;

            int tempNumber = number;
            while (tempNumber >= 10) {
                tempNumber = tempNumber / 10;
            }
            return lastDigit + tempNumber;
        }
    }
}

