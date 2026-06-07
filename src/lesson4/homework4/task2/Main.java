package lesson4.homework4.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banan");
        words.add("cat");
        words.add("dog");
        words.add("pineapple");
        words.add("apricot");
        words.add("house");
        words.add("car");
        words.add("sun");
        words.add("book");
        words.add("school");
        words.add("milk");
        words.add("water");
        words.add("bread");
        words.add("tea");
        words.add("caramel");
        words.add("sugar");
        words.add("macciato");
        words.add("latte");
        words.add("flatwhite");

        System.out.println("Before sort " + words);

        words.sort(Comparator.naturalOrder());
        System.out.println("By alphabet " + words);
    }
}
