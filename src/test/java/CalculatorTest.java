import es.ulpgc.dacd.Calculator;
import es.ulpgc.dacd.Operation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(8, calculator.calculate(Operation.ADD, 5, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(6, calculator.calculate(Operation.SUBTRACT, 10, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, calculator.calculate(Operation.MULTIPLY, 6, 2));
    }

    @Test
    void testDivision() {
        assertEquals(3, calculator.calculate(Operation.DIVIDE, 9, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                calculator.calculate(Operation.DIVIDE, 5, 0)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

