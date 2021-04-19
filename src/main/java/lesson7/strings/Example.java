package lesson7.strings;

public class Example {

    public static void main(String[] args) {

        String s = "12341212";

        boolean contains = s.contains("123");
        boolean b1 = s.startsWith("123");
        boolean b = s.endsWith("234");

        int i = s.indexOf("12");
        int index = s.lastIndexOf("12");

        int length = s.length();
        char[] chars = s.toCharArray();

        String[] split = s.split("1");

        boolean matches = s.matches("[0-9]+");
        String all = s.replaceAll("12", "55");


    }
}
