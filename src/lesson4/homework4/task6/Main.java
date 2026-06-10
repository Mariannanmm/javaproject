package lesson4.homework4.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);


        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println("sorting : " + sortedNumbers);

        List<Integer> multiplesOfThree = numbers.stream()
                .filter(n -> n % 3 == 0)
                .toList();
        System.out.println("multiples of 3: " + multiplesOfThree);

        List<Integer> multiplesOfTen = numbers.stream()
                .filter(n -> n % 10 == 0)
                .toList();
        System.out.println("multiples of 10: " + multiplesOfTen);


        System.out.println("by foreach():");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();


        List<Integer> tripledNumbers = numbers.stream()
                .map(n -> n * 3)
                .toList();
        System.out.println("tripled numbers: " + tripledNumbers);

    }
}
