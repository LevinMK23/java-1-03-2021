package lesson7.expressions;

public class Sum extends BinaryExpression {

    public Sum(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public Number eval() {
        return getLeft().eval().intValue() +
                getRight().eval().intValue();
    }

    @Override
    public void print() {
        System.out.print("(");
        getLeft().print();
        System.out.print(" + ");
        getRight().print();
        System.out.print(")");
    }
}
