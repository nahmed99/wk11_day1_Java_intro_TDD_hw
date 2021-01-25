import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd() {
        // Expected value, actual value
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void canSubtract() {
        // Expected value, actual value
        assertEquals(3, calculator.subtract(9, 6));
    }

    @Test
    public void canMultiply() {
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void canDivide() {
        assertEquals(7.5, calculator.divide(15, 2), 0.0);
    }

}
