package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void test_addition() {
        Assertions.assertEquals(2, new Calculator().add(1, 1));
    }

    @Test
    void test_subtraction() {
        Assertions.assertEquals(1, new Calculator().sub(2, 1));
    }

    @Test
    void test_multiplication() {
        Assertions.assertEquals(2, new Calculator().mul(2, 1));
    }

    @Test
    void test_division() {
        Assertions.assertEquals(2, new Calculator().div(4, 2));
        Assertions.assertEquals(0, new Calculator().div(4, 0));
    }
}
