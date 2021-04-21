package lesson7;

public class Cat {
    private final String name;
    private boolean hungry;
    private int appetite;

    public Cat(String name) {
        hungry = true;
        appetite = (int) (2 + Math.random() * 50);
        this.name = name;
    }

    public void eat(Plate p) {

        if (p.getFood() >= appetite) {
            hungry = false;
            p.eatFood(appetite);
            System.out.println(" Кот " + name + " съел " + appetite + " еды из тарелки");
        } else {
            System.out.println("Еды в тарелке мало для " + name);
        }


    }

    public int getAppetite() {

        return appetite;
    }

    public String getName() {
        return name;
    }

}
