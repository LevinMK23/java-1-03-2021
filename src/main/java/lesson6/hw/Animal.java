package lesson6.hw;

public abstract class Animal {

    private static int animalCount = 0;

    protected int runLimit;
    protected int swimLimit;
    private final String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public String getName() {
        return name;
    }
}
