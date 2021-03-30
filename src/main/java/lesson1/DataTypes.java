package lesson1;

public class DataTypes {

    public static void main(String[] args) {
        // целые
        // операции с целыми числами: + - * / %
        byte byteValue = 124; // 1b -128; 127
        short shortValue = 12142; // -32000; 32000
        int x = 3; // 4b -2*10^9; 2*10^9
        long longValue = 124124125125125125L; // 8b -10^19;10^19
        System.out.println(6 / 7);
        System.out.println(x);
        x = x + 3;
        System.out.println(x);
        // дробные
        double doubleValue = 0.5; // 8b 16 знаков после запятой
        float floatValue = 0.5f; // 4b 8 знаков после запятой

        System.out.println(1 / 3d);
        System.out.println(1 / 3f);

        // логический тип
        boolean flag = longValue == shortValue;
        // виды сравнений >, <, >=, <=, !=, ==

        // и && или ||

        boolean f = 1 > 2 || 2 == 2 || 1 != 1;
        boolean f1 = 1 > 2 && 2 == 2 && 2 == 3;

        if (flag) {
            System.out.println("flag 1");
        } else {
            System.out.println("flag 2");
        }

        // Определить принадлежит ли х отрезку от 0 до 10

        x = 5;
        if (x >= 0 && x <= 10) {
            System.out.println("Принадлежит");
        } else {
            System.out.println("Не принадлежит");
        }

        // тернарный оператор
        int z = x > 3 ? 1 : 0;
        System.out.println("z = " + z);
        // символьный тип (одна буква!) только одинарные кавычки

        char sym = 'a';

        // специальные символы: ', \ - нужно экранировать через \
        // \\, \'

        // строки в двойных кавычках
        // ", \ нужно экранировать
        // строки не являются примитивами
        String s = "1233513513512512\\\"";
    }
}
