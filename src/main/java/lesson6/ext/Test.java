package lesson6.ext;

import lesson6.A;

public class Test {

    static void process(A a) {
        System.out.println(a.foo());
        System.out.println(a.foo(5));
    }

    public static void main(String[] args) {
//        A a = new A(8);
//        A b = new B(8);
//
//        System.out.println(a.getClass());
//        System.out.println(b.getClass());
//
//        process(new A(5));
//        process(new B(5));
//        process(new C(10));

        A c = new C(4);

    }
}
