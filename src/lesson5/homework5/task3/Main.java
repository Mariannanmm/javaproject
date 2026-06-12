package lesson5.homework5.task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String home = System.getProperty("user.home") + File.separator + "qqq" + File.separator;
        Path studentsPath = Paths.get(home + "students.txt");
        Path coursesPath = Paths.get(home + "courses.txt");
        Path resultPath = Paths.get(home + "result.txt");

        try {
            // 1. read students from file and make a list
            List<Student> students = Files.readAllLines(studentsPath).stream()
                    .map(line -> {
                        String[] parts = line.split(",");
                        return new Student(Integer.parseInt(parts[0]), parts[1]);
                    })
                    .toList();
            // 2. the same with courses
            List<Course> courses = Files.readAllLines(coursesPath).stream()
                    .map(line -> {
                        String[] parts = line.split(",");
                        return new Course(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]));
                    })
                    .toList();
            // 3. JOIN by Stream API
            List<EnrolledStudent> report = courses.stream()
                    .map(course -> {

                        Student matchedStudent = students.stream()
                                .filter(s -> s.getId() == course.getStudentId())
                                .findFirst()
                                .orElse(new Student(course.getStudentId(), "Unknown"));

                        return new EnrolledStudent(
                                matchedStudent.getId(),
                                matchedStudent.getName(),
                                course.getCourseId(),
                                course.getCourseName()
                        );
                    })
                    .toList();

            report.forEach(item -> System.out.println(item.toFileString()));
            System.out.println("====================================");

            List<String> linesToSave = report.stream()
                    .map(EnrolledStudent::toFileString)
                    .toList();

            Files.write(resultPath, linesToSave, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("done in file result.txt!");

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
