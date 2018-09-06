package pl.pjaskiewicz.udemy.cjm.sec5.lec34.CodingExercises.DecimalComparator;

import org.junit.Test;

import static org.junit.Assert.*;
import static pl.pjaskiewicz.udemy.cjm.sec5.lec34.CodingExercises.DecimalComparator.Main.areEqualByThreeDecimalPlaces;

public class MainTest {
    @Test
    public void areEqualByThreeDecimalPlaces_TRUE() {

        assertTrue("check if two numbers are equal by 3 decimal points", areEqualByThreeDecimalPlaces(1,1));
        assertTrue("check if two numbers are equal by 3 decimal points", areEqualByThreeDecimalPlaces(1.1234,1.1235));
        assertTrue("check if two numbers are equal by 3 decimal points", areEqualByThreeDecimalPlaces(0.0012,0.0016));
        assertTrue("check if two numbers are equal by 3 decimal points", areEqualByThreeDecimalPlaces(-0.999,-0.999));


    }
    @Test
    public void areEqualByThreeDecimalPlaces_FALSE() {

        assertFalse("check if two numbers are NOT equal by 3 decimal points", areEqualByThreeDecimalPlaces(1.001,1));



    }
}