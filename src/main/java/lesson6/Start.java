package lesson6;


public class Start {


    public static void main(String[] args) {
        Cat cat = new Cat("Листик");
        Dog dog = new Dog("Шляпа");

        int dist = Animals.getInsertRunSwim();

        System.out.println(Animals.getAnimalCount());
        System.out.println(Cat.getCountCat());
        System.out.println(Dog.getCountDog());

        cat.run(dist);
        cat.swim(dist);
        dog.run(dist);
        dog.swim(dist);

    }
}
