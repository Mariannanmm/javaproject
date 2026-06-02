package lesson2.homework2.task2;

public class Engine {
    private double volume;
    private FuelType fuelType;

    public Engine() {}

    public Engine(double volume, FuelType fuelType) {
        this.volume = volume;
        this.fuelType = fuelType;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", fuelType=" + fuelType +
                '}';
    }
}
