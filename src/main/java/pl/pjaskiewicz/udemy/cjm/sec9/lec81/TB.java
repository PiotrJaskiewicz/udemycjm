package pl.pjaskiewicz.udemy.cjm.sec9.lec81;

import pl.pjaskiewicz.udemy.cjm.utils.Utils;

import java.util.Arrays;

public class TB {
    public static void main(String[] args) {

        Utils utils = new Utils();
        int[] array = utils.arrayWithSubsequentNumbers((int)Math.pow(10,7));
        System.out.println("Original array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));

    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
