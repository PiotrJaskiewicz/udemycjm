package pl.pjaskiewicz.udemy.cjm.sec6.lec40;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    public static int sumOdd(int start, int end) {

        if (start > end || start < 0 || end < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;

                }
            }
            return sum;
        }


    }
}
