package lesson5.list;

public class MyArray {

    private int[] data;
    private int size;
    private int capacity;

    public MyArray() {
        capacity = 100;
        data = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        data[size] = value;
        size++;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
