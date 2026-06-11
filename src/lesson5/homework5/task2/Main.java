package lesson5.homework5.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Path path = Paths.get(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "task2.txt");


        List<Student> initialStudents = new ArrayList<>();
        initialStudents.add(new Student("Lae`zel", 20, 3));
        initialStudents.add(new Student("Astarion", 350, 1));
        initialStudents.add(new Student("Gale", 35, 4));
        initialStudents.add(new Student("Shadowheart", 45, 2));
        initialStudents.add(new Student("Karlach", 32, 2));

        try {

            List<String> linesToWrite = initialStudents.stream()
                    .map(Student::toFileString)
                    .toList();

            Files.write(path, linesToWrite, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);


            List<String> linesFromFile = Files.readAllLines(path);

            System.out.println("Students sorted by age");
            linesFromFile.stream()
                    .map(Student::fromFileString)
                    .sorted(Comparator.comparingInt(Student::getAge))
                    .forEach(student -> System.out.println("Student: " + student.getName() +
                            ", Age: " + student.getAge() +
                            ", Course: " + student.getCourse()));


        } catch (IOException e) {
            System.out.println("Сталася помилка при роботі з файлом!");
            e.printStackTrace();
        }

    }
}
