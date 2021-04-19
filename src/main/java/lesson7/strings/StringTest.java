package lesson7.strings;

public class StringTest {

    static void processString() {
        String s = "";
        // String a = "234" + "456"
        // "[2,3,4]" + "[4,5,6]" -> [2,3,4,4,5,6]
        for (int i = 0; i < 512000; i++) {
            s += "a";
        }
    }

    static void processStringBuilder() {
        StringBuilder s = new StringBuilder();
        //[aaaaaa]
        //[aaaaaa________________________] x2
        //[______________________________________________________________]
        for (int i = 0; i < 512000; i++) {
            s.append("a");
        }
    }

    static void benchMark(Processor processor) {
        long start = System.currentTimeMillis();
        processor.process();
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms.");
    }

    public static void main(String[] args) {
        benchMark(StringTest::processString);
        benchMark(StringTest::processStringBuilder);
    }

}
