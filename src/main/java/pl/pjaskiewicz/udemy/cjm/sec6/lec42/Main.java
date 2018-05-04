package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

public class Main {
    public static void main(String[] args) {

        Palindrome palidrome = new Palindrome();
        int number = 100191001;
        System.out.println("Is the number " + number + " palidrome? " + palidrome.isPalindrome(number));

    }
}
