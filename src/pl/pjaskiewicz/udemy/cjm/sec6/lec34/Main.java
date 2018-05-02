package pl.pjaskiewicz.udemy.cjm.sec6.lec34;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is prime number");
                if(count == 50){

                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        /*moja metoda
        int j = 0;
        for (int i = 10; i < 50; i++) {

<<<<<<< HEAD
            if (isPrime(i) == true) {
                j = j + 1;
                System.out.println(j + " out of 3 prime numbers is:" + i);

                if (j == 50) break;
            }
        }*/


    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {//wystarczy sprawdzic do sqrt(n) bo na lewo i prawo od niego lezy tyle samo dzielnikow
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
