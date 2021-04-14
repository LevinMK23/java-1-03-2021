package lesson6;

public class A {

    protected int a;

    public A(int a) {
        this.a = a;
        System.out.println("A created " + this);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int foo() {
        return a * 2;
    }

    public int foo(int arg) {
        return a * arg;
    }
}
