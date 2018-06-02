package pl.pjaskiewicz.udemy.cjm.sec9.lec70;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        radomArrayFiling(myArray);
        System.out.println(Arrays.toString(myArray));

        sorting(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    public static void sorting(int[] array) {
        int temp;

        if (array == null ) {
            System.out.println("NULL");
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - 1-i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");
    }

    public static void radomArrayFiling(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*1000);
        }
    }

}
