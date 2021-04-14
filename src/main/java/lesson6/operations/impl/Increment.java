package lesson6.operations.impl;

import lesson6.operations.Expression;
import lesson6.operations.Operand;
import lesson6.operations.UnaryOperation;

public class Increment extends UnaryOperation {

    public Increment(Expression operand) {
        super(operand);
    }

    @Override
    public int eval() {
        return getOperand().eval() + 1;
    }
}
