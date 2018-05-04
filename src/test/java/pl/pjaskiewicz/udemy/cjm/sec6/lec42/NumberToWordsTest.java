package pl.pjaskiewicz.udemy.cjm.sec6.lec42;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToWordsTest {

    NumberToWords numberToWords = new NumberToWords();

    @Test
    public void negativeNumberTest() {
        assertEquals(-1, numberToWords.getDigitCount(-5));
    }

    @Test
    public void zeroNumberTest() {
        assertEquals(1, numberToWords.getDigitCount(0));
    }

    @Test
    public void randomNumberTest() {
        assertEquals(2, numberToWords.getDigitCount(14));
        assertEquals(4, numberToWords.getDigitCount(1000));
        assertEquals(5, numberToWords.getDigitCount(90001));
        assertEquals(1, numberToWords.getDigitCount(0));
        assertEquals(1, numberToWords.getDigitCount(2));
    }


}
