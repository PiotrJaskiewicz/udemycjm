package pl.pjaskiewicz.udemy.cjm.sec9.lec80;
//finding minimum value from given array


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 3;
        int min = findMin(readIntegers(count));
        System.out.println("Minimum value = " + min);


    }

    private static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        System.out.println("Please type " + count + " numbers");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
