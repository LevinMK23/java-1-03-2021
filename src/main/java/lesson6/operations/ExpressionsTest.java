package lesson6.operations;

import lesson6.operations.impl.Multiply;
import lesson6.operations.impl.Sum;

public class ExpressionsTest {

    public static void main(String[] args) {

        Expression expression = new Multiply(
            new Sum(new Operand(3), new Operand(5)),
            new Sum(new Operand(4), new Operand(3))
        );

        System.out.println(expression.eval());
    }
}
