package pl.pjaskiewicz.udemy.cjm.sec9.lec81;

import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {

    @Test
    public void reverse() {
        Main main = new Main();
        //int[] array = {3, 2, 1};
        //int[] arrayReversed = {1, 2, 3};
        //assertArrayEquals(arrayReversed, main.reverse(array));

        assertArrayEquals(new int[]{3,2,1}, main.reverse(new int[]{1,2,3}));


    }
}