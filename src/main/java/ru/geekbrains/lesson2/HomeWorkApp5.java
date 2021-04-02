package ru.geekbrains.lesson2;

/*public class HomeWorkApp5 {

}
*/
import java.util.Scanner;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        dateYear();
    }

    public static void dateYear() {
        Scanner date = new Scanner(System.in);
        System.out.print("введите дату......:");
        int x = date.nextInt();
        date.close();

        if ((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0))) {
            System.out.println("является високостным");
        } else {
            System.out.println("не является високостным");
        }

    }
}

