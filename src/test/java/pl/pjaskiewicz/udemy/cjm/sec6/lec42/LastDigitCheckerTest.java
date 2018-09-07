package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

import org.junit.Test;

import static org.junit.Assert.*;
import static pl.pjaskiewicz.udemy.cjm.sec6.lec42.LastDigitChecker.hasSameLastDigit;

public class LastDigitCheckerTest {

    @Test
    public void hasSameLastDigit_TRUE() {
        assertTrue(hasSameLastDigit(10,11,21));
    }


    @Test
    public void hasSameLastDigit_FALSE() {
        assertFalse(hasSameLastDigit(12,34,56));
        assertFalse(hasSameLastDigit(1,10,10));
        assertFalse(hasSameLastDigit(10,1,10));
        assertFalse(hasSameLastDigit(10,10,1));
    }
}