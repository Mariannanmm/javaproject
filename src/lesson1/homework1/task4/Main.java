package lesson1.homework1.task4;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog("Pirat", "German shepherd", 5, 54.8));
        dogsList.add(new Dog("Larisa", "Chihuahua", 12, 1.2));
        dogsList.add(new Dog("Mykola", "noBreed", 4, 65));

        System.out.println("***usersList***");
        for (Dog dog : dogsList) {
            System.out.println(dog);
        }
    }
}
