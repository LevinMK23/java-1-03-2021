package lesson7.interfaces;

import java.util.StringTokenizer;

public class StringReader implements Readable {

    private final StringTokenizer tokenizer;

    public StringReader(String source) {
        tokenizer = new StringTokenizer(source);
    }

    @Override
    public String read() {
        if (tokenizer.hasMoreTokens()) {
            return tokenizer.nextToken();
        }
        return null;
    }
}
