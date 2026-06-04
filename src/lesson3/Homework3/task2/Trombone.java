package lesson3.Homework3.task2;

public class Trombone implements Instrument{
    private double diameter;

    public Trombone(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("play Trombone with diameter " + diameter + " booboo");
    }

}
