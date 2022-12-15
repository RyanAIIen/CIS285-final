package cis285.labs;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    public TestCalculator() {}

    Calculator testCalc = new Calculator();


    @Test
    public void testPositive(){
      assertEquals(5, testCalc.add(2, 3));
    }

    @Test
    public void testNegative(){
      assertEquals(-5, testCalc.add(-2, -3));
    }

    @Test
    public void testMixed(){
      assertEquals(5, testCalc.add(-2, 7));
    }

    @Test
    public void testMinInt(){
    // https://runestone.academy/ns/books/published/apcsareview/VariableBasics/minAndMax.html
    assertEquals(Integer.MIN_VALUE, testCalc.add(-2000000000, -147483648));
    }

    @Test
    public void testMaxInt(){
    // https://runestone.academy/ns/books/published/apcsareview/VariableBasics/minAndMax.html
    assertEquals(Integer.MAX_VALUE, testCalc.add(2000000000, 147483647));
    }
}
