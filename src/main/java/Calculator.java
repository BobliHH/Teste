import java.math.BigDecimal;

public class Calculator {
    private BigDecimal accumulator = BigDecimal.ZERO;
    private BigDecimal operand1=BigDecimal.ZERO;
    private BigDecimal operand2=BigDecimal.ZERO;

    public void setAccumulator(BigDecimal value) {
        accumulator = value;
    }

    public BigDecimal getAccumulator() {
        return accumulator;
    }

    public void setOperands(BigDecimal val1, BigDecimal val2) {
        operand1= val1;
        operand2 = val2;

    }

    public BigDecimal add() {
        return operand1.add(operand2);
    }

    public BigDecimal multiply(){
        return operand1.multiply(operand2);
    }

    public BigDecimal subtract(){
        return operand1.subtract(operand2);
    }

    public BigDecimal divide(){
        return operand1.divide(operand2);
    }

}
