package lesson6;


import java.util.Scanner;

public abstract class Animals {
    protected int runLimit;

    protected int swimLimit;

    private static int animalCount = 0;

    private final String name;

    public static int getInsertRunSwim() {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите размер препятствия :");
        int dist = number.nextInt();
        number.close();
        return dist;


    }


    public static int getAnimalCount() {

        return animalCount;
    }

    public Animals(String name) {
        this.name = name;

        animalCount++;


    }


    public abstract void swim(int dist);

    public abstract void run(int dist);

    public String getName() {

        return name;
    }


}










