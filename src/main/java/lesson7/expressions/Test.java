package lesson7.expressions;

public class Test {

    public static void main(String[] args) {

        Expression e = new Division(
                new Sum(new Argument(1), new Argument(2)),
                new Sum(new Argument(5), new Argument(4))
        );

        e.print();
        System.out.println("=" + e.eval());

    }
}
