package pl.pjaskiewicz.udemy.cjm.sec8.lec67.PJ;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    Addition lettuce = new Addition("lettuce", 1, 3);
    Addition tomato = new Addition("tomato", 1.5, 0);
    Addition cucumber = new Addition("cucumber", 1.5, 0);
    Addition onion = new Addition("onion", 0.5, 0);
    Addition bacon = new Addition("bacon", 2, 1);

    @Test
    public void checkTotalPrice(){
        assertEquals(3.0, lettuce.additionPrice(), 0.000001);
    }
}
