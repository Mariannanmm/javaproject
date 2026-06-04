package lesson3.Homework3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(6));
        instruments.add(new Drum("Large"));
        instruments.add(new Trombone(6.7));

        System.out.println("***My orchestra play loud***");
        for (Instrument instrument : instruments) {
            instrument.play();
        }


    }
}
