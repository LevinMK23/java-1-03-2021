package lesson6.ext;

import lesson6.A;

public class B extends A {

    public B(int a) {
        super(a);
        System.out.println("B created " + this);
    }

    @Override
    public int foo() {
        return a + 2;
    }

    @Override
    public int foo(int arg) {
        return a + arg;
    }
}
