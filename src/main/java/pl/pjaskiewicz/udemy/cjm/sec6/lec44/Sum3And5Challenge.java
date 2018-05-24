package pl.pjaskiewicz.udemy.cjm.sec6.lec44;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {   //3,5,6,9,10
                sum += i;
                counter++;
                System.out.println("Found number = " + i);
            }
            if(counter == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);

    }

}
