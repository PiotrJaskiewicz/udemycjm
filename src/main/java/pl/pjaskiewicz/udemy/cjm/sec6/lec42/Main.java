package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

public class Main {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        int number = 100;
        System.out.println("Is the number " + number + " palindrome? " + palindrome.isPalindrome(number));

        FirstLastDigitSum firstLastDigitSum = new FirstLastDigitSum();
        int input = -252;
        System.out.println("Sum of first and last digits of " + input + " equal to: " + firstLastDigitSum.sumFirstAndLastDigit(input));

        input = 257;
        System.out.println("Sum of first and last digits of " + input + " equal to: " + firstLastDigitSum.sumFirstAndLastDigit(input));

        input = 0;
        System.out.println("Sum of first and last digits of " + input + " equal to: " + firstLastDigitSum.sumFirstAndLastDigit(input));

        input = 5;
        System.out.println("Sum of first and last digits of " + input + " equal to: " + firstLastDigitSum.sumFirstAndLastDigit(input));

        input = 2147483647;
        System.out.println("Sum of first and last digits of " + input + " equal to: " + firstLastDigitSum.sumFirstAndLastDigit(input));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("*****************");
        NumberToWords numberToWords = new NumberToWords();

        numberToWords.numberToWords(1234);
        numberToWords.numberToWords(1000);
        numberToWords.numberToWords(-1000);
        numberToWords.numberToWords(10);
        numberToWords.numberToWords(0);

        System.out.println("*****************");
        System.out.println(numberToWords.getDigitCount(2));


        System.out.println("*****************");
        System.out.println(numberToWords.reverse(-123));


    }
}
