package lesson3.Homework3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book());
        printables.add(new Magazine());

        for (Printable printableThing : printables) {
            printableThing.print();
        }



    }
}
