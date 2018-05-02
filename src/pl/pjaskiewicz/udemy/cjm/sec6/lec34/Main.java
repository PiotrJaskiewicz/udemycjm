package pl.pjaskiewicz.udemy.cjm.sec6.lec34;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is prime number");
                if(count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }


    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {//wystarczy sprawdzic do sqrt(n) bo na lewo i prawo od niego lezy tyle samo dzielnikow
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
