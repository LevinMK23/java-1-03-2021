package lesson5;

public class Cat {

    private final int dmg;
    private int hp;
    private final String name;

    public Cat(String name) {
        this.name = name;
        hp = 100;
        dmg = (int) (1 + Math.random() * 20);
    }

    public void fightWith(Cat enemy) {
        if (isAlive() && enemy.isAlive()) {
            hit(enemy);
            if (enemy.isAlive() && isAlive()) {
                enemy.hit(this);
            }
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }

    private void hit(Cat enemy) {
        if (enemy.getHp() > dmg) {
            enemy.hit(dmg);
            System.out.println(getSelfName() + " нанес " + dmg + " единиц урона, " +
                    enemy.getEnemyName() +
                    ". У врага осталось " + enemy.getHp() + " единиц здоровья");
        } else {
            enemy.hp0();
            System.out.println("Ваш враг повержен");
        }
    }

    private void hit(int dmg) {
        hp -= dmg;
    }

    private void hp0() {
        hp = 0;
    }

    public int getDmg() {
        return dmg;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    private String getSelfName() {
        return "Кот: " + name;
    }

    private String getEnemyName() {
        return "Коту: " + name;
    }

    @Override
    public String toString() {
        return "Кот: " + name;
    }
}
