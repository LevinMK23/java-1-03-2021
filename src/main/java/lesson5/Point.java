package lesson5;

public class Point {

    private static int cnt = 0;
    // private внутри класса
    // внутри папки
    // protected внутри папки и также в наследниках
    // public везде
    private final int id;
    private int x;
    private int y;

    public Point() {
        cnt++;
        id = cnt;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        cnt++;
        id = cnt;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
