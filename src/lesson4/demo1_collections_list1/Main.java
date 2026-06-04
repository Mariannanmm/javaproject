package lesson4.demo1_collections_list1;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(903);
        integers.add(190);
        integers.add(6789);
        integers.add(98);
        System.out.println(integers);

        Integer integer = integers.get(3);
        integers.sort((o1, o2) -> o1 - o2);

        integers.removeIf(next -> next % 2 == 0);



    }
}
