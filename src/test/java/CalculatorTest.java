import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void addValues() {
        assertEquals(4, Calculator.addValues(2, 2));
    }

    @Test
    void subtractValue() {
        assertEquals(5, Calculator.subtractValue(9, 4));
    }

    @Test
    void divideValue() {
        assertEquals(3, Calculator.divideValue(6, 2), 0.0001);
    }

    @Test
    void multiplyValues() {
        assertEquals(4, Calculator.multiplyValues(2, 2));
    }
}