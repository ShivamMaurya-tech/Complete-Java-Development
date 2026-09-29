package com.shivam.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddWithZero() {
      assertEquals(7, new Calc().add(7, 0));
    }

    @Test
    public void testAddNegativeNumbers() {
      assertEquals(-9, new Calc().add(-4, -5));
    }

    @Test
    public void testAddMixedSigns() {
      assertEquals(3, new Calc().add(8, -5));
    }
}
