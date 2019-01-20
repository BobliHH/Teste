import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperationsTest {
    private Calculator calculator;
    @Before
    public void createCalculatorWithTwoOperands(){
    calculator = new Calculator();
    calculator.setOperands(new BigDecimal(20),new BigDecimal(4));
    }


    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        calculator.setOperands(new BigDecimal(20),new BigDecimal(4));
        assertEquals(new BigDecimal(24),calculator.add());
    }

    @Test
    public void testSubtract(){
        assertEquals(new BigDecimal(16),calculator.subtract());

    }

    @Test
    public void testMultiply(){
        assertEquals(new BigDecimal(80),calculator.multiply());

    }
    @Test
    public void testDivide(){
        assertEquals(new BigDecimal(5),calculator.divide());
    }
}
