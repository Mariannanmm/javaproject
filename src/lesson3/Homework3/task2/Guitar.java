package lesson3.Homework3.task2;

public class Guitar implements Instrument{
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play() {
        System.out.println("Play Guitar with strings " + numberOfStrings + " brimbrim");

    }

}
