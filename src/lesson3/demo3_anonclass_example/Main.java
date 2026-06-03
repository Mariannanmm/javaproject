package lesson3.demo3_anonclass_example;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(456);
        integers.add(789);
        integers.add(357);
        System.out.println(integers);

    //    ComparatorImpl comparator = new ComparatorImpl();
    //    integers.sort(comparator);

        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(integers);


    }
}
