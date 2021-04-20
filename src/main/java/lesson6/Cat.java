package lesson6;


class Cat extends Animals {

    private static int countCat = 0;


    public Cat(String name) {

        super(name);
        countCat++;
        swimLimit = 0;
        runLimit = 200;


    }


    @Override
    public void swim(int swimLimit) {


        System.out.println("Коты не умеют плавать");

    }

    @Override
    public void run(int dist) {
        if (dist <= runLimit) {
            System.out.println("Кот " + getName() + " пробежал " + dist + " м.");
        } else {
            System.out.println("Кот " + getName() + " устал!");
        }

    }

    public static int getCountCat() {
        return countCat;
    }
}
