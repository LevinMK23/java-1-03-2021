package lesson6.animals;

public class AnimalTest {



    static void say(Animal animal) {
        animal.say();
    }

    public static void main(String[] args) {
        say(new Cat());
        say(new Dog());
        say(new Cow());
        say(new Fox());

        Animal animal = new Animal() {

            @Override
            public void say() {

            }
        };

        System.out.println(animal.getClass());

        animal = new Animal() {

            @Override
            public void say() {

            }
        };

        System.out.println(animal.getClass());

    }

}
