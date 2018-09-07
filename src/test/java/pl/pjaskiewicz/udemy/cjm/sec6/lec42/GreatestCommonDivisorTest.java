package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

import org.junit.Test;

import static org.junit.Assert.*;
import static pl.pjaskiewicz.udemy.cjm.sec6.lec42.GreatestCommonDivisor.getGreatestCommonDivisor;

public class GreatestCommonDivisorTest {

    @Test
    public void getGreatestCommonDivisor_ALL() {
        assertEquals(10,getGreatestCommonDivisor(10,20));
        assertEquals(6,getGreatestCommonDivisor(12,30));
        assertEquals(5,getGreatestCommonDivisor(25,15));
        assertEquals(-1,getGreatestCommonDivisor(9,18));
        assertEquals(9,getGreatestCommonDivisor(81,153));
    }
}