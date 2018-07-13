package pl.pjaskiewicz.udemy.cjm.sec9.lec81;


//Reverse array challange

import pl.pjaskiewicz.udemy.cjm.utils.Utils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();

        int[] array = utils.arrayWithSubsequentNumbers(100000);
        System.out.println("Original array: " + Arrays.toString(array));

        System.out.println("Reversed array: " + Arrays.toString(reverse(array)));

    }

    public static int[] reverse(int[] array) {
        int[] arrayReversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReversed[i] = array[array.length - i - 1];
        }

        return arrayReversed;
    }
}
