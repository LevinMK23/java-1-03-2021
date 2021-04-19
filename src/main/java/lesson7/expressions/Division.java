package lesson7.expressions;

public class Division extends BinaryExpression {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public Number eval() {
        return getLeft().eval().doubleValue() /
                getRight().eval().doubleValue();
    }

    @Override
    public void print() {
        System.out.print("(");
        getLeft().print();
        System.out.print(" / ");
        getRight().print();
        System.out.print(")");
    }
}
