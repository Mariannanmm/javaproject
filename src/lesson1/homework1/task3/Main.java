package lesson1.homework1.task3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book(1, 320, "NStivenson", "simmis"));
        booksList.add(new Book(2, 230, "JDiamond", "Third chimpanzee"));
        booksList.add(new Book(3, 437, "JNHarari", "Nexus"));

        System.out.println("***booksList***");
        for (Book book : booksList) {
            System.out.println(book);
        }
    }
}
