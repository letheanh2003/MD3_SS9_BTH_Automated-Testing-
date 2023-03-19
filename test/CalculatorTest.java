package BTH1_Calculator.test;

import BTH1_Calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing add 11 + 0")
    public void testAdd0And0() {
        int first = 11;
        int second = 0;
        int expected = 0;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void testSub0and0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = Calculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 1 - 0")
    public void testSub1and0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = Calculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 1")
    public void testSub0and1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = Calculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void testSub5and3() {
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = Calculator.sub(first, second);
        assertEquals(expected, result);
    }
}
