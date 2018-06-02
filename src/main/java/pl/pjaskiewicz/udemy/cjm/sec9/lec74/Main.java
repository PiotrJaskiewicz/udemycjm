package pl.pjaskiewicz.udemy.cjm.sec9.lec74;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntvalue = myIntValue;

        System.out.println("My int value = " + myIntValue);
        System.out.println("Another int value = " + anotherIntvalue);

        anotherIntvalue++;

        System.out.println("My int value = " + myIntValue);
        System.out.println("Another int value = " + anotherIntvalue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println(" myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(" anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("After change: myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change: anotherArray = " + Arrays.toString(anotherArray));
        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("After modify: myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify: anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }

}
