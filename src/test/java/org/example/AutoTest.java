package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AutoTest {
    @Test
    public void speedUpOn20KmhNewSpeedIs50Kmh(){
        //given
        Vehicle auto = new Auto(1,"auto", 30);

        // when
        int actual = auto.accelerate(20);

        // then
        Assertions.assertEquals(50, actual);
    }

}