package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

public class Palindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = Math.abs(number);
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        if (reverse == Math.abs(number)) {
            return true;

        } else
            return false;


    }
}
