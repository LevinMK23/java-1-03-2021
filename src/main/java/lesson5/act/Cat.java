package lesson5.act;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name) {
        this.name = name;
        age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void meow() {
        System.out.println("MEOW");
    }

    public void putInWater() {
        System.out.println("SHHHHSHSHSHSHSHSH");
    }
}
