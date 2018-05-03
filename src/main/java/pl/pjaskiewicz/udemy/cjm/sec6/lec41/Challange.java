package pl.pjaskiewicz.udemy.cjm.sec6.lec41;

public class Challange {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int countEven = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            countEven++;

            if(countEven == 5){
                System.out.println("Total " + countEven + " even numbers was found, see above");
                break;
            }

        }
    }


    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else
            return false;
    }
}
