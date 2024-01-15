import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testMultiplier(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(2,2), 4);
        assertEquals(calculator.multiply(2,2,2), 8);
    }


}