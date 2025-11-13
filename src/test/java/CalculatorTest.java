import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void addValues() {
        assertEquals(4, calculator.addValues(2, 2));
    }

    @Test
    void subtractValue() {
        assertEquals(5, calculator.subtractValue(9, 4));
    }

    @Test
    void divideValue() {
        assertEquals(3, calculator.divideValue(6, 2), 0.0001);
    }

    @Test
    void multiplyValues() {
        assertEquals(4, calculator.multiplyValues(2, 2));
    }
}