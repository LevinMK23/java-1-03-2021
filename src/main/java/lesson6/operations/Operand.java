package lesson6.operations;

public class Operand extends Expression {

    private int value;

    public Operand(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int eval() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
