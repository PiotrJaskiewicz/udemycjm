package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (first >= 10 && first <= 1000 &&
                second >= 10 && second <= 1000 &&
                third >= 10 && second <= 1000) {
            int first2 = first%10;
            int second2 = second%10;
            int third2 = third%10;

            if (first2 == second2 ||
                    first2 == third2 ||
                    second2 == third2
                    ) {
                return true;
            } else {
                return false;
            }
        } else
            return false;
    }
}
