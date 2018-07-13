package pl.pjaskiewicz.udemy.cjm.utils;

import java.util.Arrays;

public class Utils {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayWithSubsequentNumbers(100)));
    }

    public static void example() {

    }

    public static int[] arrayWithSubsequentNumbers(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        return array;
    }

}
