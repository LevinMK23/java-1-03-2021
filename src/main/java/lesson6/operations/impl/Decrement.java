package lesson6.operations.impl;

import lesson6.operations.Operand;
import lesson6.operations.UnaryOperation;

public class Decrement extends UnaryOperation {

    public Decrement(Operand operand) {
        super(operand);
    }

    @Override
    public int eval() {
        return getOperand().eval() - 1;
    }
}
