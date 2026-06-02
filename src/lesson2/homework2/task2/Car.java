package lesson2.homework2.task2;

public class Car {
    private String brand;
    private int year;
    private Engine engine;
    private SteeringWheel steeringWheel;

    public Car() {}

    public Car(String brand, int year, Engine engine, SteeringWheel steeringWheel) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
        this.steeringWheel = steeringWheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", steeringWheel=" + steeringWheel +
                '}';
    }
}
