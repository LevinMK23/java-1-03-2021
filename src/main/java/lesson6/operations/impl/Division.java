package lesson6.operations.impl;

import lesson6.operations.BinaryOperation;
import lesson6.operations.Expression;

public class Division extends BinaryOperation {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int eval() {
        return getLeft().eval() / getRight().eval();
    }
}
