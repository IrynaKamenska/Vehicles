package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrradTest {
    @Test
    public void speedUp20KmhNewSpeedIs30Kmh(){
        //given
        Vehicle fahhrad = new Fahrrad(1,"fahhrad", 10);

        // when
        int actual = fahhrad.accelerate(20);

        // then
        Assertions.assertEquals(30, actual);
    }



    @Test
    public void speedUp30KmhAndExpectFail() {
        try {
            Vehicle fahhrad = new Fahrrad(1,"fahhrad", 20);
            fahhrad.accelerate(30);
            fail("Should have thrown an exception");
        } catch (final RuntimeException e) {
            assertTrue(true);
        }
    }


}