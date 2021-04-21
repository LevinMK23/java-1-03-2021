package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {

        this.food = food;
    }


    public void info() {

        System.out.println("В тарелке: " + food + " еды");
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {

        return food;
    }

    public void addFood(int foot) {
        this.food += food;

    }

    public void eatFood(int n) {
        food -= n;
    }

}



