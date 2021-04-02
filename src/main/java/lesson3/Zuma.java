package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zuma {

    // 1 2 2 6 7

    private static int getRandomDigit() {
        return (int) (Math.random() * 10);
    }

    private static void process(ArrayList<Integer> zuma) {
        int cnt = 1;
        for (int i = 0; i < zuma.size() - 1; i++) {
            if (zuma.get(i).equals(zuma.get(i + 1))) {
                cnt++;
                // 1 1 1 1 -> 3
                if (i == zuma.size() - 2) {
                    if (cnt >= 3) {
                        int pos = i - cnt + 2;
                        for (int j = 0; j < cnt; j++) {
                            zuma.remove(pos);
                        }
                        i = 0;
                    }
                }
            } else {
                // 1 2 3 3 3 3
                if (cnt >= 3) {
                    int pos = i - cnt + 1;
                    for (int j = 0; j < cnt; j++) {
                        zuma.remove(pos);
                    }
                    i = 0;
                }
                cnt = 1;
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> zuma = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            zuma.add(i);
        }

        while (true) {
            System.out.println(zuma);
            int current = getRandomDigit();
            System.out.println("You have " + current);
            System.out.println("Input shot index");
            int index = in.nextInt();
            zuma.add(index, current);
            System.out.println(zuma);
            process(zuma);
            if (zuma.size() == 0) {
                System.out.println("You win");
                return;
            }
        }
    }

}
