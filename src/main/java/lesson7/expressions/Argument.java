package lesson7.expressions;

public class Argument implements Expression {

    private final Number value;

    public Argument(Number value) {
        this.value = value;
    }

    @Override
    public Number eval() {
        return value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }

    public Number getValue() {
        return value;
    }
}
