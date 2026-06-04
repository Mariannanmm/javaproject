package lesson3.Homework3.task2;

public class Drum implements Instrument{
    private String size;

    public Drum(String size) {
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Play Drum with size " + size + " bambam");

    }

}
