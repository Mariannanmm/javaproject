package lesson4.demo2_collections_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");

        strings.set(1, "actually second");

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(456);
        integers.add(789);

        List[] lists = {strings, integers};

    }
}
