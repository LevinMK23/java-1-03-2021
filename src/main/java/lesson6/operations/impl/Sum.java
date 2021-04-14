package lesson6.operations.impl;

import lesson6.operations.BinaryOperation;
import lesson6.operations.Expression;

public class Sum extends BinaryOperation {

    public Sum(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int eval() {
        return getLeft().eval() + getRight().eval();
    }
}
