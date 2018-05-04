package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastDigitSumTest {
    FirstLastDigitSum firstLastDigitSum = new FirstLastDigitSum();

    @Test
    public void negativeNumberTest() {
        assertEquals(-1, firstLastDigitSum.sumFirstAndLastDigit(-252));
    }

    @Test
    public void oneDigitNumberTest() {
        assertEquals(8, firstLastDigitSum.sumFirstAndLastDigit(4));
    }

    @Test
    public void zeroNumberTest() {
        assertEquals(0, firstLastDigitSum.sumFirstAndLastDigit(0));
    }

    @Test
    public void tenNumberTest() {
        assertEquals(1, firstLastDigitSum.sumFirstAndLastDigit(10));
    }

}

