package lesson5.homework5.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private int course;

    public String toFileString() {
        return "Name: " + name + ", Age: " + age + ", Course: " + course;
    }


    public static Student fromFileString(String line) {
        String cleanLine = line
                .replace("Name: ", "")
                .replace("Age: ", "")
                .replace("Course: ", "");

        String[] parts = cleanLine.split(", ");

        String name = parts[0];
        int age = Integer.parseInt(parts[1]);
        int course = Integer.parseInt(parts[2]);

        return new Student(name, age, course);
    }
}
