package lesson7;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Листик");
        cats[1] = new Cat("Мурзик");
        cats[2] = new Cat("Мурлыка");
        Plate plate = new Plate(120);

        Arrays.stream(cats).forEach(cat -> {
            if (plate.getFood() >= cat.getAppetite()) {

                cat.eat(plate);
            } else {
                System.out.println("Кот " + cat.getName() + " остался голодный");
                System.out.println("нельзя есть в минус");
            }
        });

        plate.info();
        // cat.eat(plate);
        //  plate.info();
        //  plate.setFood(plate.getFood() - cat.getAppetite());
        // plate.setFood(plate.getFood() - cat.getAppetite());
        // plate.setFood(plate.getFood() - cat.getAppetite());
        //  plate.setFood(plate.getFood() - cat.getAppetite());


        //   plate.info();
    }

}

