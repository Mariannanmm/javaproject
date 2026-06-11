package lesson5.demo1_io_nio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Path maria = Paths.get(System.getProperty("user.home"));
    //    Stream<Path> stream = Files.list(maria);
    //    stream.forEach(file -> System.out.println(file));

    //    System.out.println(maria.toAbsolutePath());

        Path mydocTXT = Paths.get(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "mydoc.txt");
    //    List<String> lines = Files.readAllLines(mydocTXT);
    //    lines.forEach(System.out::println);
        String msg = " piu piu piu";
        byte[] msgBytes = msg.getBytes(StandardCharsets.UTF_8);
        Files.write(mydocTXT, msgBytes, StandardOpenOption.APPEND);


    }
}
