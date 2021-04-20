package lesson6;


class Dog extends Animals {

    private static int countDog = 0;

    public Dog(String name) {
        super(name);

        countDog++;
        runLimit = 500;
        swimLimit = 200;


    }

    @Override
    public void swim(int dist) {
        if (dist <= runLimit) {
            System.out.println("Пес " + getName() + " проплыл " + dist + " м.");
        } else {
            System.out.println("Пес " + getName() + " не может плыть так долго!");
        }

    }

    @Override
    public void run(int dist) {
        if (dist <= runLimit) {
            System.out.println("Пес " + getName() + " пробежал " + dist + " м.");
        } else {
            System.out.println("Пес " + getName() + " не может пробежать так далеко!");
        }

    }

    public static int getCountDog() {
        return countDog;
    }
}