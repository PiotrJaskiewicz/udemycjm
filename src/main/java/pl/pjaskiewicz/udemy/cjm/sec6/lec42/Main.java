package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

public class Main {
    public static void main(String[] args) {

        Palindrome palidrome = new Palindrome();
        int number = 100191001;
        System.out.println("Is the number " + number + " palidrome? " + palidrome.isPalindrome(number));

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


    }
}
