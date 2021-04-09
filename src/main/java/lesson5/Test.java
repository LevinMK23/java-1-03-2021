package lesson5;

public class Test {
    public static void main(String[] args) {

        Point point = new Point();
        point.setX(1);
        point.setY(2);

        System.out.println(point);
        Point p2 = new Point(5, 7);

        System.out.println(p2);

        Cat cat1 = new Cat("Васька");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Иван");

        cat1.fightWith(cat2);
        cat2.fightWith(cat3);
        cat3.fightWith(cat1);

    }
}
