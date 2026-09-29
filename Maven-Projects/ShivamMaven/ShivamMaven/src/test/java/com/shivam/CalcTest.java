package com.shivam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc calc = new Calc();
    @Test
    void add(){
        assertEquals(5, calc.add(2, 3));
    }
}
