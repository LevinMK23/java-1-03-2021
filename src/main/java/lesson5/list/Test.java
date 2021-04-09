package lesson5.list;

public class Test {

    public static void main(String[] args) {

        MyArray array = new MyArray();

        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }

        array.print();
        array.set(3, 11);
        array.print();
    }
}
