package lesson6.ext;

import lesson6.A;

public class C extends B {

    public C(int a) {
        super(a);
        System.out.println("C created " + this);
    }

    @Override
    public int foo(int arg) {
        return a / arg;
    }

    @Override
    public int foo() {
        return a / 2;
    }
}
