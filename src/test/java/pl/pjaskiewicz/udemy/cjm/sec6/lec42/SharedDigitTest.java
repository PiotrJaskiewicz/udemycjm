package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

import org.junit.Test;

import static org.junit.Assert.*;
import static pl.pjaskiewicz.udemy.cjm.sec6.lec42.SharedDigit.hasSharedDigit;

public class SharedDigitTest {

    @Test
    public void hasSharedDigit_TRUE() {
        assertTrue(hasSharedDigit(12,23));
        assertTrue(hasSharedDigit(10,10));
        assertTrue(hasSharedDigit(15,55));
    }
    @Test
    public void hasSharedDigit_FALSE() {
        assertFalse(hasSharedDigit(0,0));
        assertFalse(hasSharedDigit(9,99));
        assertFalse(hasSharedDigit(10,23));
    }
}