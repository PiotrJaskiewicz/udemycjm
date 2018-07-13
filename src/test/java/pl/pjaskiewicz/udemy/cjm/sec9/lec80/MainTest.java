package pl.pjaskiewicz.udemy.cjm.sec9.lec80;

import org.junit.Test;

import static org.junit.Assert.*;
//import static pl.pjaskiewicz.udemy.cjm.sec9.lec80.Main.findMin;

public class MainTest {

    Main main = new Main();
    // mozna utworzyć instancję klasy i w teście poniżej wpisać main.findMin(array)
    //lub zaimportować metodę import static pl.pjaskiewicz.udemy.cjm.sec9.lec80.Main.findMin; i poniżej tylko findMin(array), TAK?
    //czy metoda musi być public?

    @Test
    public void findMinTest_positiveNumbers(){
        int[] array = {1,2,3};
        assertEquals("This is NOT the lowest number from array",1, main.findMin(array));
    }

    @Test
    public void findMinTest_negativeNumbers(){
        int[] array = {-10, -2, -500};
        assertEquals("This is NOT the lowest number from array",-500, main.findMin(array));
    }
    @Test
    public void findMinTest_randomNumbers(){
        int[] array = {-10, 5, 12345679};
        assertEquals("This is NOT the lowest number from array",-10, main.findMin(array));
    }

    @Test
    public void findMinTest_positiveNegativeZeroNumbers(){
        int[] array = {-10, 0, 12345679};
        assertEquals("This is NOT the lowest number from array",-10, main.findMin(array));
    }
    @Test
    public void findMinTest_onlyZeros(){
        int[] array = {0, 0, 0};
        assertEquals("This is NOT the lowest number from array",0, main.findMin(array));
    }

}