package lesson4.homework4.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("first");
        words.add("cut");
        words.add("one");
        words.add("notfirst");
        words.add("car");
        words.add("code");
        words.add("main");
        words.add("lesson");
        words.add("boots");
        words.add("cod");
        words.add("spring");
        words.add("string");
        words.add("product");
        words.add("html");
        words.add("java");

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() >= 4)
                .sorted()
                .toList();

        System.out.println("result by Stream: " + filteredWords);
    }
}
