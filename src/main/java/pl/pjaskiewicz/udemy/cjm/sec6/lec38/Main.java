package pl.pjaskiewicz.udemy.cjm.sec6.lec38;

public class Main {
    public static void main(String[] args) {
        NumberInWord numberInWord = new NumberInWord();

        for (int i = 0; i < 11; i++) {
            numberInWord.printNumberInWord(i);
        }
        NumberOfDaysInMonth daysInMonth = new NumberOfDaysInMonth();
        System.out.println(daysInMonth.getDaysInMonth(1,2020));
        System.out.println(daysInMonth.getDaysInMonth(2,2020));
        System.out.println(daysInMonth.getDaysInMonth(2,2018));
        System.out.println(daysInMonth.getDaysInMonth(-1,2020));
        System.out.println(daysInMonth.getDaysInMonth(1,-2020));
    }


}
