package lesson7.interfaces;

public class Console implements Writable {

    @Override
    public void write(String str) {
        System.out.println(str);
    }
}
