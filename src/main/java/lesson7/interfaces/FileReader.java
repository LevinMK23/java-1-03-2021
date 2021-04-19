package lesson7.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Readable {

    private final Scanner in;

    public FileReader(String path) throws FileNotFoundException {
        in = new Scanner(new File(path));
    }

    @Override
    public String read() {
        if (in.hasNext()) {
            return in.next();
        }
        return null;
    }
}
