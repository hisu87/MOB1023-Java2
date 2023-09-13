package Lab8;

import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }


        list.forEach((x) -> {
            System.out.print(" " + x);
        });
    }
}
