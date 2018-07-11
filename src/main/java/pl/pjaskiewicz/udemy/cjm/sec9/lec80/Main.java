package pl.pjaskiewicz.udemy.cjm.sec9.lec80;
//finding minimum value from given array

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(findMin(readIntegers(3)));

    }

    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Type " + i + " element of array");
            array[i] = scanner.nextInt();
        }
        System.out.println("User array is: " + Arrays.toString(array));
        return array;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i<array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Minimum value from users array is: ");
        return min;
    }

}
