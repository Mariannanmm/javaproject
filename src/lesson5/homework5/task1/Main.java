package lesson5.homework5.task1;

import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path path = Paths.get(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "task1.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("error, file not found");
            e.printStackTrace();
        }


    }
}
