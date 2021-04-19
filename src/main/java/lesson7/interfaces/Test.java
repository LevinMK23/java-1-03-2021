package lesson7.interfaces;

import java.io.FileNotFoundException;

public class Test {

    static void printAllWords(Readable readable) {
        while (true) {
            String word = readable.read();
            if (word == null) {
                break;
            }
            System.out.println(word);
        }
    }

    static void writeString(Writable writable, String str) {
        writable.write(str);
    }

    public static void main(String[] args) throws FileNotFoundException {

        Readable fileReader = new FileReader("data.txt");
        Readable stringReader = new StringReader("Hello    world \n\nfrom \t\rstring");

        printAllWords(stringReader);

        writeString(new Console(), "Hello world");
        writeString(new FileWriter("output.txt"), "Hello world!");


        ConsoleReadWriter readWriter = new ConsoleReadWriter();

        String str = readWriter.read();
        readWriter.write("Прочитано: " + str);
    }
}
