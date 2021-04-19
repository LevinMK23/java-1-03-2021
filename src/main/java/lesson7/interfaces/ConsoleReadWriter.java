package lesson7.interfaces;

import java.util.Scanner;

public class ConsoleReadWriter implements Readable, Writable {

    private final Scanner in;

    public ConsoleReadWriter() {
        in = new Scanner(System.in);
    }

    @Override
    public String read() {
        if (in.hasNext()) {
            return in.next();
        }
        return null;
    }

    @Override
    public void write(String str) {
        System.out.println(str);
    }
}
