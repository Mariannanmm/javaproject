package lesson3.demo5_what_for;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(67);
        integers.add(-89);
        integers.add(684);
        integers.add(100600);
        integers.add(0);
        integers.sort(Comparator.comparingInt(o -> o));
        System.out.println(integers);

    }
}
