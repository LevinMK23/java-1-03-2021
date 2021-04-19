package lesson7.interfaces;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileWriter implements Writable {

    private final String path;

    public FileWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(String str) {
        try {
            FileOutputStream fos = new FileOutputStream(path, true);
            fos.write(str.getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException("File not found!");
        }
    }
}
