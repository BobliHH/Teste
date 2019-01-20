import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void newCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorHasAccumulatorValueEqualWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void testSettingAccumulator() {
        BigDecimal value = new BigDecimal(10);
        calculator.setAccumulator(value);
        assertEquals(value, calculator.getAccumulator());

    }
}
