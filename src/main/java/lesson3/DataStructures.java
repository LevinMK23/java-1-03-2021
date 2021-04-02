package lesson3;

import java.util.ArrayList;

public class DataStructures {

    public static void main(String[] args) {
        int[] a = new int[5];
        Integer intValue = 5;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.add(2, 100500);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        list.get(0); // getter a[0]
        list.set(0, 12); // setter


    }
}
