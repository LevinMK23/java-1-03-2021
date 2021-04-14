package lesson6.operations;

public abstract class UnaryOperation extends Operation {

    private Expression operand;

    public UnaryOperation(Expression operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }
}
